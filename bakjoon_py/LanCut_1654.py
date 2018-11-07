n = int(input())
nArray = list(input().split())
m = int(input())
mArray = list(input().split())

nArray.sort()

exist = False
for x in mArray:

    start = 0
    end = n-1
    mid = int((start+end)/2)

    a = int(nArray[mid])
    b = int(x)


    while end-start >= 0:
        print(b)
        if a == b:
            exist = True
            break;
        elif a > b:
            start = mid + 1
            continue
        else:
            end = mid - 1
            continue

    print('1' if exist else '0')
