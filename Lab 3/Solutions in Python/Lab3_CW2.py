marks = int(input())
if marks >= 90 and marks <= 100:
    print("Your grade is A")
elif marks >= 85 and marks <= 89:
    print("Your grade is A-")
elif marks >= 70 and marks <= 84:
    print("Your grade is B")
elif marks >= 57 and marks <= 69:
    print("Your grade is C")
elif marks >= 50 and marks <= 56:
    print("Your grade is D")
elif marks < 50:
    print("Your grade is F")