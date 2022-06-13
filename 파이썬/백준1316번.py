import sys
count = 0
for i in range(int(sys.stdin.readline())):
    w = sys.stdin.readline().strip()
    if list(w) == sorted(w, key=w.find):
        count += 1
print(count)
