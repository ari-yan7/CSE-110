first = int(input("Input the 1st number: "))
second = int(input("Input the 2nd number: "))
third = int(input("Input the 3rd number: "))
if first == second == third:
    print("All numbers are equal")
elif first == second or second == third or first == third:
    print("Neither all are equal or different")
else:
    print("All numbers are different")