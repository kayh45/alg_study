def mFun(n):
	result = 0
	if n > 1000:
		result += int(n / 1000)
		n -= int(n / 1000) * 1000
	if n > 100:
		result += int(n / 100)
		n -= int(n / 100) * 100
	if n > 10:
		result += int(n / 10)
		n -= int(n / 10) * 10
	result += n

li = [True] * 10000
for i in range(1, 10000): li[mFun(i)] = False
for x in range(li):
	if li[x]: print(x)
	if li[x+1] > 10000: break
