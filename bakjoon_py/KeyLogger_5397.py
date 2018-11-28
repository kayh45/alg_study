from sys import stdin
num = int(input())
for _ in range(num):
	pwd = stdin.readline().strip()
	cursor = 0
	left = []
	right = []
	for i in range(len(pwd)):
		if pwd[i] == "<":
			if cursor > 0:
				right.append(left.pop())
				cursor -= 1
		elif pwd[i] == ">":
			if cursor <= (len(left) + len(right) - 1):
				left.append(right.pop())
				cursor += 1
		elif pwd[i] == "-":
			if cursor > 0:
				left.pop()
				cursor -= 1
		else:
			left.append(pwd[i])
			cursor += 1
	right.reverse()
	print(''.join(left + right))
