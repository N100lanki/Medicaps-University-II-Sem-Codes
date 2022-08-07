# 20 sum of cube of n natural numbers
num = int(input("Enter number limit : "))
sumofCubes = 0
for i in range(1, num + 1):
    sumofCubes += i ** 3
print(sumofCubes)