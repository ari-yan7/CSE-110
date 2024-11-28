payment = int(input())
age = int(input())
if age < 18 or payment < 10000:
    print("Your tax amount in 0 Tk")
elif age >= 18 and payment >= 10000:
    if payment <= 20000 and payment >= 10000:
        tax = payment * 0.05
        print("Your tax amount in", tax, "Tk")
    elif payment > 20000:
        tax = payment * 0.1
        print("Your tax amount in", tax, "Tk")