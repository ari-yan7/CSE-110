num = int(input())
temp = num
count = 0
while temp>0:
    temp = temp // 10
    count += 1
while count>0:
    div = 10 ** (count-1)
    if count == 1:
        print(num)
    else:
        print(num // div , end=", ")
    num = num % div
    count -= 1