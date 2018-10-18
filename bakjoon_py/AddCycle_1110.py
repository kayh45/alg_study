n = 26
m = n
cnt = 0
while True:
    a = 0 + int(m/10)
    b = m - a*10
    c = a + b
    m = (b*10 + c%10)
    cnt+=1
    print("{},{},{},{}".format(a,b,c,m))
    break
    if n == m: break
print(cnt)
