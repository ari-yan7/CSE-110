a = float(input())
b = float(input())
c = float(input())
max = 0
min = 0
if a > b and c > b:
    min = b
elif a > c and b > c:
    min = c
else:
    min = a
if a < b and c < b:
    max = b
elif a < c and b < c:
    max = c
else:
    max = a

print("Maximum Number: ",max)
print("Minimum Number: " ,min)