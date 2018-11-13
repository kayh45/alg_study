from sys import stdin

def isSosu(mNum):
    for a in range(2, int(mNum/2)+1):
    	if mNum % a == 0: return False
    return True

stdin.readline()
mList = stdin.readline().split()
for x in range(len(mList)): mList[x] = int(mList[x])

sum = 0
for i in mList:
	if i > 1 and isSosu(i): sum += 1

print(sum)
