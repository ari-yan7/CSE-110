number = int(input())
if number % 5 == 0 and number % 7 == 0:
    print("Divisible by both")
elif number % 5 == 0 and number % 7 != 0:
    print("Invalid: Divisible by 5 only")
elif number % 5 != 0 and number % 7 == 0:
    print("Invalid: Divisible by 7 only")
else:
    print("No")