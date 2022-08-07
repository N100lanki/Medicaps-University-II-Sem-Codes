# Fibbonacci series
def fib (n):
    a = -1
    b = 1
    while n != 0:
        c = a + b
        print(c, end=" ")
        a = b
        b = c
        n = n - 1
num = int(input("Enter numbers of fibbonacci : "))
fib(num)