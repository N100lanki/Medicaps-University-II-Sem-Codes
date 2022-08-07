# Swap three numbers
x = int(input("Enter first  number : "))
y = int(input("Enter second number : "))
z = int(input("Enter third  number : "))
print("Original numbers are :", x, y, z)
x, y, z = z, x, y
print("Swapped numbers are :", x, y, z)