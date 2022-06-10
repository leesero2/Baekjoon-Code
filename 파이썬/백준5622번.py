import sys

dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
a = sys.stdin.readline()
r = 0
for i in range(len(a)):
    for j in dial:
        if a[i] in j: # a[i]가 j안에 있다면
             r += dial.index(j)+3
print(r)