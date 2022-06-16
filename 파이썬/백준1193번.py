n = int(input())
line = 0
max_n = 0
while n > max_n:
    line += 1
    max_n += line
g = max_n - n
if line % 2 == 0:
    top = line - g
    under = g + 1
else :
    top = g + 1
    under = line - g
print("{0}/{1}".format(top, under))
