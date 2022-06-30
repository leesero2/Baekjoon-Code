T = int(input())

ap = [[0]*15 for _ in range(15)] # 15개의 배열이 15개로 초기화
ap[0] = [x for x in range(15)] # 0층은 i호에 i명이사니까 그 인원대로 초기화

#조건식이 크지않으니 전부 값을 대입
for i in range(1, 15): # 1호부터 14호까지 반복
    for j in range(1, 15):
        ap[i][j] = ap[i][j-1] + ap[i-1][j]

        #ap에 [i층][j호]의 사람들은 ap[i층][j호-1] + ap[i층-1][j호]의 값이랑 같음

for _ in range(T):
    k = int(input())
    n = int(input())
    print(ap[k][n])
