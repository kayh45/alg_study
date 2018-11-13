from sys import stdin

nList = list()
while True :
    inputNum = int(stdin.readline())
    if inputNum == 0: break;
    nList.append(inputNum)

n = (max(nList) + 1) * 2
l = int(n ** 0.5)
mList = [True] * n

for x in range(2, l+1):
    if mList[x]:
        for y in range(x*2, n, x): mList[y] = False

resultList = list()

for y in nList:
    sum = 0
    for z in range(y+1, (2*y)+1):
        if mList[z] == True : sum += 1
    resultList.append(sum)

for res in resultList: print(res)
