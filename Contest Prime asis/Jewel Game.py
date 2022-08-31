#!/bin/python3

import math
import os
import random
import re
import sys

from collections import deque

def getMaxScore(jewels):
    score = 0

    if len(jewels) > 1:
        d_q = deque()
        end = 0
        while end < len(jewels):
            if not d_q:
                d_q.append(jewels[end])
                end += 1
            else:
                if d_q[-1] == jewels[end]:
                    score += 1
                    end += 1
                    d_q.pop()
                else:
                    d_q.append(jewels[end])
                    end += 1

    return score


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        jewels = input()

        ans = getMaxScore(jewels)

        fptr.write(str(ans) + '\n')

    fptr.close()