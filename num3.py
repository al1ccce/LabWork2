def WhatTimeIsIt(number):
    hours = number / 100
    minutes = number % 100
    return (hours >= 0 and hours <= 23) and (minutes >= 0 and minutes <= 59)

def YesOrNo(numbers, n):
    for i in range(n):
        if WhatTimeIsIt(numbers[i]):
            print("YES")
        else:
            print("NO")

n = int(input("n = "))
numbers = list()
for i in range(n):
    x = int(input("Enter the number: "))
    numbers.append(x)
YesOrNo(numbers, n)
