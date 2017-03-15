number = int(input())

if number%2 == 0 and ((number >= 2 and number <= 5) or number > 20):
    print("Not Weird")
else:
    print("Weird")
