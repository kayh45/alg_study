from sys import stdin
num = int(input())

table = [ [10, 10], [1, 1], [2, 4, 8, 6], [3, 9, 7, 1], [4, 6], [5, 5], [6, 6], [7, 9, 3, 1], [8, 4, 2, 6], [9, 1] ]
lenOfTable = list()
for i in table: lenOfTable.append(len(i))

for _ in range(num):
	line = stdin.readline().split()
	a = int(line[0]) % 10; b = int(line[1])
	res = table[a][(b-1) % lenOfTable[a]]
	print(res)
