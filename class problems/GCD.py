number1 = int(input())
number2 = int(input())
orig1, orig2 = number1, number2

while number2 != 0:
    remainder = number1 % number2
    number1 = number2
    number2 = remainder

print("The GCD of {orig1} and {orig2} is {number1}")
