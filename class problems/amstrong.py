number = int(input())
origNumber = number
sum_val = 0

temp = number
while temp > 0:
    digit = temp % 10
    sum_val = sum_val + (digit * digit * digit)
    temp = temp // 10

if sum_val == origNumber:
    print( "number is an Armstrong number")
else:
    print("number not an Armstrong number")
