msg = input()
going, happyCnt = int()
isNone = True

for x in msg:
    if x == ':':
        going += 1
        continue
    if going == 1 and x == '-':
        going += 1
        continue
    if going == 2 and x == ')':
        happyCnt += 1
        isNone = False
    if going == 2 and x == '(':
        happyCnt -= 1
        isNone = False
    going = 0
print('none' if isNone else 'happy' if happyCnt > 0 else 'sad' if happyCnt < 0 else 'unsure')
