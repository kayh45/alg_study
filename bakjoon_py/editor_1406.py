import sys
para = sys.stdin.readline().split()[0]
loop = int(sys.stdin.readline().split()[0])

left = list(para)
right = []

for x in range(loop):
    cmds = sys.stdin.readline().split()
    if len(cmds) == 1:
        if cmds[0] == "L":
            if left: right.append(left.pop())
        elif cmds[0] == "D":
            if right: left.append(right.pop())
        elif cmds[0] == "B":
            if left: left.pop()
    else: left.append(cmds[1])
right.reverse()
print(''.join(left + right))
