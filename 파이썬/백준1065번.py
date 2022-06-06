n = int(input()) # 입력값
count = 0 # 0으로 초기화
if n < 100: # 만약 입력값이 n보다 작으면
    print(n) # n을 그대로 출력
else: # 아니라면
    for i in range(100, n+1): # 100부터 n+1까지 반복
        if i//100-i//10%10 == i//10%10-i%10: # (i 나누기 100한 몫) - (i 나누기 10) % 10
            count += 1 # 그리고 증감
    print(99+count)

