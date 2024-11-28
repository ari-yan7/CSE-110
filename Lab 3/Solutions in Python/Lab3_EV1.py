a = int(input())
b = int(input())
c = int(input())
if a > b and c > b:
    print("Smallest Number:",b)
elif b > a and c > a:
    print("Smallest Number:",a)
else:
    print("Smallest Number:",c)