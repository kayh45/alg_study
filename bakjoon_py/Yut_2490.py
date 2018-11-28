for _ in range(3):
	yoots = input().split(); num = 0
	for x in yoots:
		if x == '0' : num += 1
	print('A' if num == 1 else "B" if num == 2 else "C" if num == 3 else "D" if num == 4 else "E")
		
