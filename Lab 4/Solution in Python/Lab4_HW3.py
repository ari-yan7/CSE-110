n = int(input())
for i in range(n+1):
    if i % 5 == 0 and i % 3 != 0:
        print(i)