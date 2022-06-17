T = int(input())

ap = [[0]*15 for _ in range(15)]
ap[0] = [x for x in range(15)]

for i in range(1, 15):
    for j in range(1, 15):
        ap[i][j] = ap[i][j-1] + ap[i-1][j]


for _ in range(T):
    k = int(input())
    n = int(input())
    print(ap[k][n])
