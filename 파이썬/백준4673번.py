def makeSelf(a):
    b = a
    while a > 0:
        b += a%10
        a = a//10
    return b

ls = [1]*10001

for n in range(1,10001):
    k = makeSelf(n)
    if k >10000:
        continue
    ls[k] = 0

for n in range(1,10001):
    if ls[n] == 1:
        print(n)