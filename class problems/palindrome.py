number = int(input())
origNumber = number
reversedNumber = 0

temp = number
while temp > 0:
    digit = temp % 10
    reversedNumber = reversedNumber * 10 + digit
    temp = temp // 10

if reversedNumber == origNumber:
    print("the number is a Palindrome")
else:
    print("the number is not Palindrome")
