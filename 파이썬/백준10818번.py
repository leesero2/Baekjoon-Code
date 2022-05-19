import sys

a = int(sys.stdin.readline().strip())
a_list = list(map(int,sys.stdin.readline().split()))
a_list.sort()

print(a_list[0],a_list[-1])

