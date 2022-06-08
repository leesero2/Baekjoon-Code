import sys
s = sys.stdin.readline()
alphabet = "abcdefghijklmnopqrstuvwxyz"
for i in alphabet:
    print(s.find(i), end = ' ')

