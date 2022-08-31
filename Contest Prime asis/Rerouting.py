#!/bin/python3

import math
import os
import random
import re
import sys


def _getMinConnectionChange(connection):
    result = 0
    visited = [set(i) for i in len(connection)]
    for i, val in enumerate(connection):
        if visited[i] == 0:
            if visited[val - 1] == 1:
                visited[i] = 1
            else:
                result += 1
                k = i
                while visited[k] == 0:
                    visited[k] = 1
                    k = val - 1
                    val = connection[k]

    return result - 1

class DisjointSet:
    def __init__(self):
        self.parent = self
        self.size = 1

    def find_parent(self):
        if self.parent != self:
            self.parent = self.parent.find_parent()
        return self.parent

    def union(self, other):
        if self == other:
            return
        root = self.find_parent()
        other_root = other.find_parent()
        if root == other_root:
            return
        if root.size > other_root.size:
            other_root.parent = root
            root.size += other_root.size
        else:
            root.parent = other_root
            other_root.size += root.size


def getMinConnectionChange(connection):
    result = 0
    visited_sets = [DisjointSet() for _ in range(len(connection))]
    has_end = False
    for i, val in enumerate(connection):
        has_end = has_end or i == val - 1
        left_val, right_val = i, val - 1
        left_set = visited_sets[left_val]
        right_set = visited_sets[right_val]
        if left_set.size > right_set.size:
            left_set.union(right_set)
        else:
            right_set.union(left_set)

    root_dic = {}
    for set_val in visited_sets:
        if set_val.parent not in root_dic:
            root_dic[set_val.parent] = 1
    if not has_end:
        return len(root_dic)

    return len(root_dic) - 1


print(getMinConnectionChange([2, 3, 4, 1, 5]))  # 1
print(getMinConnectionChange([1, 2, 3, 4]))  # 3
print(getMinConnectionChange([2, 3, 4, 1]))  # 1
print(getMinConnectionChange([2, 1, 4, 3, 5]))  # 2
#
print(getMinConnectionChange([1, 3, 4, 4]))  # 1

print(getMinConnectionChange([1, 2, 4, 3]))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    connection = list(map(int, input().rstrip().split()))

    result = getMinConnectionChange(connection)

    fptr.write(str(result) + '\n')

    fptr.close()