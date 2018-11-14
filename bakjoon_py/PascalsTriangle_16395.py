import math
cmd = input().split(); n = int(cmd[0]); k = int(cmd[1]); half = math.ceil(n*0.5)
if n <= 2: print(1); exit()
if k > math.ceil(n*0.5):
	k = half - (k - half)
	if n%2 == 0: k += 1
aList = [1, 1]; bList = list()
for x in range(3, n+1):
	bList.append(1)
	for n in range(1, math.ceil(x*0.5)):
		if x%2 == 1 and n == math.ceil(x*0.5)-1:
			bList.append(aList[n-1] + aList[n-1])
		else: bList.append(aList[n] + aList[n-1])
	aList = bList; bList = list()
print(aList[k-1])
