# n = int(input())
# line = 0
# max_n = 0
# while n > max_n:
#     line += 1
#     max_n += line
# g = max_n - n
# if line % 2 == 0:
#     top = line - g
#     under = g + 1
# else :
#     top = g + 1
#     under = line - g
# print("{0}/{1}".format(top, under))
#

n = int(input())
index = 0
# 어느 행에 들어갈 것인가?
while True:
    index += 1
    print(index,"index")
    sum = index * (index + 1) / 2 # 그룹의 총 합
    print(sum,"sum")
    if n <= sum: # 그룹의 총 합보다 같거나 작아진다면
        break # 탈출

# 그 행에서 몇번째 값인가?
num = int(n - (index - 1) * index / 2)
print(num,"num")

# 짝수행인가 홀수행인가?
if index % 2 == 0:
    print("{0}/{1}".format(num, index - num + 1))
else:
    print("{0}/{1}".format(index - num + 1, num))