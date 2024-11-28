year = int(input())
if year % 100 ==0:
    if year % 400 == 0:
        print(year,"is a Leap year")
    else:
        print(year,"is not a Leap year")
elif year % 4 == 0:
    print(year,"is a Leap year")
else:
    print(year,"is not a Leap year")