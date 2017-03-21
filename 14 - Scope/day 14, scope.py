class Difference:
    def __init__(self, a):
        self.__elements = a
# Add your code here

def computeDifference(self):
    self.maximumDifference = 0

    min = self.__elements[0]
    max = self.__elements[0]

    for i in range(len(self.__elements)):
        if self.__elements[i] < min:
            min = self.__elements[i]

        if self.__elements[i] > max:
            max = self.__elements[i]

    self.maximumDifference = abs(max - min)
# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)