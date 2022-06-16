n = int(input())

line = 0  # 사선 라인 (홀수 짝수를 구분하기 위함)
max_n = 0  # 입력된 숫자(input_num 변수)의 라인에서 가장 큰 숫자

# 사선 라인에서 제일 큰 수를 알아내는 반복문
while n > max_n:
    line += 1
    max_n += line
    # print(max_n,"sd")

gap = max_n - n

if line % 2 == 0:  # 사선 라인이 짝수번째 일 때
    top = line - gap  #분자
    under = gap + 1  #분모

else :  # 사선 라인이 홀수번째 일 때
    top = gap + 1  #분자
    under = line - gap  #분모

print("{0}/{1}".format(top, under))
