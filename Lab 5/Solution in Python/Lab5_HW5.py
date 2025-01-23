n = int(input())
i = 2
while True:
    div_sum = 0
    for j in range(1, i):
        if i % j == 0:
            div_sum += j
    if div_sum == i:
        print(i)
        n-=1
    i+=1
    if n == 0:
        break