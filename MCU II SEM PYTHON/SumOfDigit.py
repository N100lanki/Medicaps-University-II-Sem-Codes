#  Sum of digits
num = input("Enter any 5 digit number : ")
if len(num) == 5:
    sum = int(num[0]) + int(num[1]) + int(num[2]) + int(num[3]) + int(num[4])
    print("Sum is :", sum)
else:
    print("Enter only five digit number.")