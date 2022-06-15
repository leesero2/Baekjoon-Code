n = int(input())
a = 1
cnt = 1
while n>a:
    a = (6 * cnt) + a
    cnt += 1
print(cnt)