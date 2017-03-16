def factorial(number):
    if number > 0:
        return number * factorial(number-1)
    else:
        return 1

print(factorial(int(input())))