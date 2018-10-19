from sys import stdin
numOfPok, numOfQuiz = input().split()

poks = dict()
poks2 = dict()
for x in range(int(numOfPok)):
    name = stdin.readline().strip()
    poks[x+1] = name
    poks2[name] = x + 1

for x in range(int(numOfQuiz)):
    quiz = stdin.readline().strip()
    if 48 <= ord(quiz[0]) <= 57:
        print(poks[int(quiz)])
    else:
        print(poks2.get(quiz))
