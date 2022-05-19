import sys

a = int(sys.stdin.read().strip())
b = int(sys.stdin.read().strip())
c = int(sys.stdin.read().strip())
arr = list(str(a*b*c))

for i in range(10):
    print(arr.count(str(i)))