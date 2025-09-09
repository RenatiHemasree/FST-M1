numbers = input("Enter a sequence of comma separated values: ").split( )
print(numbers)
sum = 0
for num in numbers:
    sum = sum +int(num)
print(sum)