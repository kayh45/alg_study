from sys import stdin

i = stdin.readline().split(); m = int(i[0]); n = int(i[1]) + 1; mList = [True] * n; l = int(n ** 0.5)

for x in range(2, l+1):
    if mList[x]:
        for y in range(x*2, n, x): mList[y] = False

if m <= 1: m = 2
for s in range(m, n):
    if mList[s]: print(s)
