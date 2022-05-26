import sys

n = int(sys.stdin.readline())

for i in range(n):
    q = sys.stdin.readline()
    count = 0
    count1 = 0

    for j in range(len(q)):

        if q[j] == 'O':
            count += 1
        else:
            count = 0
        count1 += count

    print(count1)

