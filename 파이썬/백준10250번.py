T = int(input())
for i in range(T):
    H, W, N = map(int, input().split())
    x = N // H + 1
    y = N % H
    if y == 0:
        y = H
        x = x - 1
    print("{0}{1}".format(y, str(x).zfill(2)))

    