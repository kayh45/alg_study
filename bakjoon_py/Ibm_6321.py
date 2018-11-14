for x in range(int(input())):
	s = input()
	for c in range(len(s)):
		if s[c] == 'Z': s = s[:c] + 'A' + s[c+1:]
		else: s = s[:c] + chr(ord(s[c]) + 1) + s[c+1:]
	print('String #{}'.format(x+1))
	print(s + '\n')
