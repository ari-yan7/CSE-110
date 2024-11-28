pay = int(input("Enter the amount the customer need to pay:"))
gave = int(input("Enter the amount the customer gave:"))
if gave == pay:
    print("The returned amount is 0 taka.")
elif pay > gave:
    print("Please pay", pay - gave, "taka more.")
else:
    change = gave - pay
    note100 = change // 100
    change50 = change % 100
    note50 = change50 // 50
    change20 = change50 % 50
    note20 = change20 // 20
    change10 = change20 % 20
    note10 = change10 // 10
    change5 = change10 % 10
    coin5 = change5 // 5
    change2 = change5 % 5
    coin2 = change2 // 2
    change1 = change2 % 2
    coin1 = change1 // 1
    print("The returned amount is", change, "taka.")
    print("100 taka note:", note100)
    print("50 taka note:", note50)
    print("20 taka note:", note20)
    print("10 taka note:", note10)
    print("5 taka coin:", coin5)
    print("2 taka coin:", coin2)
    print("1 taka coin:", coin1)