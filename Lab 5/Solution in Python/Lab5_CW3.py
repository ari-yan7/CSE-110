start = int(input("Start: "))
end = int(input("End: "))
print("Armstrong numbers:")
digit_total = 0
temp = start
while temp > 0:
    temp //= 10
    digit_total += 1
for i in range(start, end+1):
    sum =0
    temp = i
    while temp > 0:
        digit = temp % 10
        sum += digit ** digit_total
        temp //= 10
    if i == sum:
        print(i)