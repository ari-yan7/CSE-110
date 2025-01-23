start = int(input())
end = int(input())
divider = int(input())
for i in range(start, end + 1):
    result = 1
    temp = i
    while temp > 0:
        result *= temp % 10
        temp //= 10
    if result % divider == 0:
        print(result)