start = int(input("Start: "))
stop = int(input("Stop: "))
for i in range(start, stop+1):
    print("Times Table of", i)
    for j in range(1, 11):
        print(i, "x", j, "=", i*j)