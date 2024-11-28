first = int(input())
second = int(input())
third = int(input())
if first > second:
    if first > third:
        print("Largest Number:",first)
elif second > first:
    if second > third:
        print("Largest Number:",second)
else:
    print("Largest Number:",third)