n = int(input())
final_sum = 0
for i in range(1, n+1):
    sum = 0
    for j in range(1, i+1):
        sum+=j
    final_sum+= sum
final_sum = - final_sum
print(final_sum)