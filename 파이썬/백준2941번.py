rep = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
s = input()
for i in rep:
    s = s.replace(i, '*')
print(len(s))