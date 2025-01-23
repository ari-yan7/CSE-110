num = int(input("Enter Number: "))
while True:
    if num%2==0:
        div_count = 0
        for i in range(1, num + 1):
            if num % i == 0:
                div_count += 1
        print(num, "has", div_count, "divisors")
        num = int(input("Enter Number: "))
    else:
        break