import random

array = []
array_length = int(input("Enter array size: "))
min = int(input("Enter min value: "))
max = int(input("Enter max value: "))


def num(min, max):
    return random.randint(min, max)


for index in range(array_length):
    array.append(num(min, max))

print("\nInitial array:")
print(array)

i = len(array)
while i > 0:
    j = 0
    while j < len(array)-1:
        if array[j] < array[j+1]:
            temp = array[j]
            array[j] = array[j+1]
            array[j+1] = temp
            print(f"\nSwap indices: {j} and {j+1}:")
            print(array)
        j += 1
    i -= 1

print("\nFinal array:")
print(array)


# SAMPLE OUTPUT:
#
# Enter array size: 10
# Enter min value: 1
# Enter max value: 20
# 
# Initial array:
# [16, 19, 16, 9, 10, 11, 2, 12, 11, 20]
# 
# Swap indices: 0 and 1:
# [19, 16, 16, 9, 10, 11, 2, 12, 11, 20]
# 
# Swap indices: 3 and 4:
# [19, 16, 16, 10, 9, 11, 2, 12, 11, 20]
# 
# Swap indices: 4 and 5:
# [19, 16, 16, 10, 11, 9, 2, 12, 11, 20]
# 
# Swap indices: 6 and 7:
# [19, 16, 16, 10, 11, 9, 12, 2, 11, 20]
# 
# Swap indices: 7 and 8:
# [19, 16, 16, 10, 11, 9, 12, 11, 2, 20]
# 
# Swap indices: 8 and 9:
# [19, 16, 16, 10, 11, 9, 12, 11, 20, 2]
# 
# Swap indices: 3 and 4:
# [19, 16, 16, 11, 10, 9, 12, 11, 20, 2]
# 
# Swap indices: 5 and 6:
# [19, 16, 16, 11, 10, 12, 9, 11, 20, 2]
# 
# Swap indices: 6 and 7:
# [19, 16, 16, 11, 10, 12, 11, 9, 20, 2]
# 
# Swap indices: 7 and 8:
# [19, 16, 16, 11, 10, 12, 11, 20, 9, 2]
# 
# Swap indices: 4 and 5:
# [19, 16, 16, 11, 12, 10, 11, 20, 9, 2]
# 
# Swap indices: 5 and 6:
# [19, 16, 16, 11, 12, 11, 10, 20, 9, 2]
# 
# Swap indices: 6 and 7:
# [19, 16, 16, 11, 12, 11, 20, 10, 9, 2]
# 
# Swap indices: 3 and 4:
# [19, 16, 16, 12, 11, 11, 20, 10, 9, 2]
# 
# Swap indices: 5 and 6:
# [19, 16, 16, 12, 11, 20, 11, 10, 9, 2]
# 
# Swap indices: 4 and 5:
# [19, 16, 16, 12, 20, 11, 11, 10, 9, 2]
# 
# Swap indices: 3 and 4:
# [19, 16, 16, 20, 12, 11, 11, 10, 9, 2]
# 
# Swap indices: 2 and 3:
# [19, 16, 20, 16, 12, 11, 11, 10, 9, 2]
# 
# Swap indices: 1 and 2:
# [19, 20, 16, 16, 12, 11, 11, 10, 9, 2]
# 
# Swap indices: 0 and 1:
# [20, 19, 16, 16, 12, 11, 11, 10, 9, 2]
# 
# Final array:
# [20, 19, 16, 16, 12, 11, 11, 10, 9, 2]
