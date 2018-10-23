def decod(exp) :
    num = 0

    for i in range(len(exp)):

        print(i)
        print(i < len(exp)-1)

        # 문자가 M인 경우
        if exp[i] == "M":
            num += 1000
            continue
        # 문자가 D인 경우
        if exp[i] == "D":
            num += 500
            continue
        # 문자가 V인 경우
        if exp[i] == "L":
            num += 50
            continue
        # 문자가 V인 경우
        if exp[i] == "V":
            num += 5
            continue

        # 문자가 C인 경우
        if exp[i] == "C":
            if i < len(exp)-1 and exp[i+1] == "D":
                num += 400
            elif i < len(exp)-1 and exp[i+1] == "M":
                num += 900
            else:
                num += 100
                continue
            print("Reace Here?")
            i += 1
        # 문자가 X인 경우
        if exp[i] == "X":
            if i < len(exp)-1 and exp[i+1] == "L":
                num += 40
            elif i < len(exp)-1 and exp[i+1] == "C":
                num += 90
            else:
                num += 10
                continue
            i += 1
        # 문자가 I인 경우
        if exp[i] == "I":
            if i < len(exp)-1 and exp[i+1] == "V":
                num += 4
            elif i < len(exp)-1 and exp[i+1] == "X":
                num += 9
            else:
                num += 1
                continue
            i += 1
    return num
front = input()
back = input()

# pass = False
sum = 0
print(decod(front))
