import sys

a = sys.stdin.readline().strip()
count = 0

if int(a) < 10:
    a = '0' + a

new_a = a
# print(new_a[0],new_a[1])
while 1:
    a1 = str(int(new_a[0]) + int(new_a[1])) #a1 = 8, 14
    new_a = new_a[-1] + a1[-1] # 68 ,84
    count += 1

    if new_a == a:
        print(count)
        break
