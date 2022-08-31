#!/bin/python3

import math
import os
import random
import re
import sys


def maxXorValue(x, k):
    result = ["0"] * len(x)

    for i, val in enumerate(x):
        if k == 0:
            break
        if val == "0":
            result[i] = "1"
            k -= 1

    result = "".join(result)
    return result


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        s = input()

        k = int(input().strip())

        y = maxXorValue(s, k)

        fptr.write(y + '\n')

    fptr.close()