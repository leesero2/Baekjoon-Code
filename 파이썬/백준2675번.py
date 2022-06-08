import sys
count = int(sys.stdin.readline())
for i in range(count):
    a,b = sys.stdin.readline().split()
    for x in b:
        print(int(a) * x, end='')
    print()

