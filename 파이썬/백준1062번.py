n = int(input())
c = 0
if n < 100: print(n)
else:
    for i in range(100, n+1):
        if i//100-i//10%10 == i//10%10-i%10: c += 1
    print(99+c)