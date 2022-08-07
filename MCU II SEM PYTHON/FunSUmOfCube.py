# 20 sum of cube of n natural numbers
num = int(input("Enter number limit : "))
def Squre(num):
    #  sum of squares of n natural numbers
    sumofSquares = 0
    for i in range(1, num + 1):
        sumofSquares += i ** 2
    return sumofSquares
def Cube(num):
    sumofCubes = 0
    for i in range(1, num + 1):
        sumofCubes += i ** 3
    return sumofCubes
def naturalNo(num):
    # 18 sum of n natural numbers
    sum = 0
    for i in range(1, num + 1):
        sum += i
    return sum

# Function to get sum of digits
def getSum(d):	
    sum = 0
    for digit in str(d):
        sum += int(digit)	
    return sum


print("Sum of Cube  till is :- ",Cube(num))
print("--------------------------------------------------")
print("Sum of Squre  till:- ",Squre(num))
print("--------------------------------------------------")
print("Sum of natural No till is . :-",naturalNo(num))
print("--------------------------------------------------")
d =int(input("Enter the Digit To Count Digit Sum:-"))
print("Sum of Digit:-",getSum(d))
print("--------------------------------------------------")
