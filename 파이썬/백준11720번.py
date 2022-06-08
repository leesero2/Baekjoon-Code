# input()
# print(sum(map(int, input())))


import sys
a = int(sys.stdin.readline())
b = sys.stdin.readline()

n = 0
for i in range(a):
    n = int(b[i]) + n
print(n)
