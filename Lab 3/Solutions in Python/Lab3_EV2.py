number = int(input())
if number < 0 :
    print("Number is negative")
elif number == 0 :
    print("Number is zero")
elif number > 0 :
    if number % 2 == 0 :
        print("Number is positive and even")
    else :
        print("Number is positive and odd")