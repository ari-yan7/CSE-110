n = int(input("Enter an integer: "))
neg = 0
pos = 0
for i in range(1,n+1):
    num = int(input(f"Enter number {i}: "))
    if num < 0:
        neg += 1
    else:
        pos += 1
print(pos, "Non-negative numbers")
print(neg, "Negative numbers")