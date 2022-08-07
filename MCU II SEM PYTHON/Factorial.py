#Factorial
num = int(input("Enter number : "))
factorial = 1
for i in range(num, 0, -1):
    print(i, end="*") if i != 1 else print(i, end="=")
    factorial *= i
print(factorial)