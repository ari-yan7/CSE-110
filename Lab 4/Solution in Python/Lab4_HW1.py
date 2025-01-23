n = int(input("Input the number of terms: "))
sum = 0
print("The odd numbers are:")
for i in range(n):
    print(2*i+1)
    sum+=2*i+1
print(f"The Sum of odd Natural Numbers upto {n} terms is:{sum}")