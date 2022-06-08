# 방법 1
import sys
s = sys.stdin.readline()
alphabet = "abcdefghijklmnopqrstuvwxyz"
for i in alphabet:
    print(s.find(i), end = ' ')

# 방법 2
ss = input()
for i in range(26):
	print(ss.find(chr(97+i)), end=' ')