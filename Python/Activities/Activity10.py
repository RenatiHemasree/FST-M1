num_tuple = input("Enter the tuples: ").split()
for num in num_tuple:
    if int(num) % 5 == 0:
        print(num)