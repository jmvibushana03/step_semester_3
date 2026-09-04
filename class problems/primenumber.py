number = int(input())
is_prime = True

c = 0
for i in range(1, number + 1):
    if number % i == 0:
        c = c + 1
    else:
        pass

if c == 2:
    is_prime = True
else:
    is_prime = False

if is_prime:
    print(number," is a Prime number")
else:
    print(number," is not a Prime number")
