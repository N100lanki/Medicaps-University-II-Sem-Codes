'''15. Write a program for the Fibonacci series using a recursive function.
'''
def recursive(n):
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return recursive(n - 1) + recursive(n - 2)


num = int(input("Enter the length of fibonacci : "))
for i in range(0, num + 1):
    print(recursive(i), end=" ")