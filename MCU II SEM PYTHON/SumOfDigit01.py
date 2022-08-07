# Python program to compute sum of digits in number.

# Function to get sum of digits
def getSum(n):	
    sum = 0
    for digit in str(n):
        sum += int(digit)	
    return sum

n =int(input("Enter the Digit"))
print(getSum(n))
