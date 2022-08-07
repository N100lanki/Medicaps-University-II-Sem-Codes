#  sum of squares of n natural numbers
num = int(input("Enter number limit : "))
sumofSquares = 0
for i in range(1, num + 1):
    sumofSquares += i ** 2
print(sumofSquares)