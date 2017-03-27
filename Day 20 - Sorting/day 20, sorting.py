#!/bin/python3

import sys

n = int(input().strip())
a = [int(a_temp) for a_temp in input().strip().split(' ')]
numberOfSwaps = 0

for i in range(n):
    for j in range(n - 1):
        if a[j] > a[j + 1]:
            tmpNumber = a[j]
            a[j] = a[j + 1]
            a[j + 1] = tmpNumber
            numberOfSwaps += 1

    if numberOfSwaps == 0:
        break;

print("Array is sorted in " + str(numberOfSwaps) + " swaps.")
print("First Element: " + str(a[0]))
print("Last Element: " + str(a[len(a) - 1]))