num = int(input())
digit = 0
while num>0:
    num = num//10
    digit+=1
print("Number of digits: ", digit)