num = int(input())
count = 0
sum = 0
for i in range(1, num):
    if num % i == 0:
        count += 1
        sum+=i
if count ==2:
    print(num, "is a prime number")
else:
    print(num, "is not a prime number")
if sum == num:
    print(num, "is a perfect number")
else:
    print(num, "is not a perfect number")