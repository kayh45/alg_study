from sys import stdin

def isSosu(mNum):
    for a in range(2, int(mNum/2)+1):
    	if mNum % a == 0: return False
    return True

m = int(stdin.readline()); n = int(stdin.readline())

mList = list(); sum = 0
for i in range(m, n+1):
    if i > 1 and isSosu(i):
    	mList.append(i); sum += i

print("-1" if len(mList) <= 0 else "{}\n{}".format(sum, mList[0]))
