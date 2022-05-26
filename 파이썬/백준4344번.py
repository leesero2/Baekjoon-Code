import sys

n = int(sys.stdin.readline())

for _ in range(n):  # n회만큼 반복
    data = input().strip().split(' ')  # 공백은 없애고 스플릿으로 값을 나눔

    scores = list(map(float, data[1:]))  # data[1:] 첫번째 요소를 제외한 뒷부분을 scores 리스트에 float로 저장
    # print(scores)

    # 평균변수
    average = sum(scores) / len(scores)  # scores 리스트를 전부 더한걸 scores 리스트 크기만큼 나눠서 평균값 구함

    # 평균값 출력
    # print(f'{average:.3f}%')

    # 평균보다 높은 학생 변수
    count = 0

    for i in scores:
        if i > average: # i번째 리스트 요소가 평균값보다 높다면
            count += 1 # 카운트 변수 증감

    print(f'{(count / len(scores)) * 100:.3f}%')
