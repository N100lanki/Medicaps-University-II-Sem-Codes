# Fibbonacci series
num = int(input("Enter numbers of fibbonacci : "))
a = -1
b = 1
while num != 0:
    c = a + b
    print(c, end=" ")
    a = b
    b = c
    num = num - 1