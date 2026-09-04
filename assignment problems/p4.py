total = 0
counter = 1
n=int (input("enter n:"))

while counter <= n:
    total = total + counter
    counter = counter + 1

print("Sum of numbers from 1 to", n, "=", total)
