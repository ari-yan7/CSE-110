num = int(input())
count = 0
i = 2
while True:
    div_count = 0
    for j in range (1, i+1):
        if i%j==0:
            div_count += 1
    if div_count == 2:
        count += 1
        print(i)
    i += 1
    if count == num:
        break