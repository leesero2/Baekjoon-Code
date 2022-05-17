a,b,c = map(int,input().split())
arr = [a,b,c]
max = arr[0]
for i in range (3):
    if(arr[i] > max):
        max = arr[i]

if(a == b and b == c):
    gift = 10000 + (a*1000)
    print(gift)
elif(a == b):
    gift = 1000 + (a*100)
    print(gift)
elif(b == c):
    gift = 1000 + (b * 100)
    print(gift)
elif(a == c):
    gift = 1000 + (a * 100)
    print(gift)
elif(a != b and b != c and a!=c):
    gift = max
    print(gift*100)
