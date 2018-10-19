def getYear(birthday):
    return int(birthday[0])

def getMonth(birthday):
    return int(birthday[1])

def getDay(birthday):
    return int(birthday[2])

birthday_1 = list(input().split())
birthday_2 = list(input().split())

dYear = getYear(birthday_2) - getYear(birthday_1)
dMonth = getMonth(birthday_2) - getMonth(birthday_1)
dDay = getDay(birthday_2) - getDay(birthday_1)

# 만나이 계산
manAge = dYear
if dMonth < 0 or (dMonth == 0 and dDay < 0) : manAge -= 1

print("{}\n{}\n{}".format(manAge, dYear + 1, dYear))    

