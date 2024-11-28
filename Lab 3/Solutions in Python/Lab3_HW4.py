id = int(input())
year = int(id // 1000000)
session = (id // 100000) % 10
if session == 1:
    print("Student joined BRAC in Spring", year)
elif session == 2:
    print("Student joined BRAC in Fall", year)
elif session == 3:
    print("Student joined BRAC in Summer", year)