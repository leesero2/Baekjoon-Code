h,m = map(int,input("1").split())
cookT = int(input("2"))

if(cookT+m>=1):
    ph = (cookT+m)//60
    pm = (cookT+m)%60

if(h+ph>23):
    print(h+ph-24,pm)
elif((h+ph)<=23):
    print(h+ph,pm)

