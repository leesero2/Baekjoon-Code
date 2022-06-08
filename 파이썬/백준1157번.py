n = input() # 입력값 (문자열)
count = 0
list=[]
n = n.upper() # 입력한 문자열을 전부 대문자로
for i in range(65,91): # 아스키코드 영어부분을 for문 돌림
    list.append(n.count(chr(i))) # 리스트에 n변수 문자열을 count 한값을 추가
p = max(list) # max함수를 이용해서 list 최대값을 p변수에 저장
for j in range(26): # 알파벳 크기만큼 반복
    if p == list[j]: # 만약 p(최대값) list[j]과 같다면 (최대 크기가 또 있다면)
        count +=1 #카운트 증감
if count >= 2: # 카운트가 2이상이면
    print("?") # ? 출력
else:
    print(chr(list.index(p)+65)) # 최대값 출력