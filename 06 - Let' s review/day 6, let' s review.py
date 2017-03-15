amountCases = int(input())

for i in range(amountCases):
    userInput = input()
    inputToCharArray = list(userInput)

    for j in range(0, len(userInput), 2):
        print(inputToCharArray[j], end="")

    print(" ", end="")
    for k in range(1, len(userInput), 2):
        print(inputToCharArray[k], end="")

    print()