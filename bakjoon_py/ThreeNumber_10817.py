num = input().split()
for x in range(3): num[x] = int(num[x])
if (num[0] > num[1] and num[0] > num[2]):print(num[1] if num[1] > num[2] else num[2])
elif(num[0] < num[1] and num[0] < num[2]): print(num[1] if num[1] < num[2] else num[2])
else: print(num[0])