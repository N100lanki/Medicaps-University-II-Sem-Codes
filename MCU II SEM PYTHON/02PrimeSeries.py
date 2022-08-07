#. Write a program to find a series of prime numbers from 100 to 200 using a for-else loop
m = int(input("Enter the lower value:"))
n = int(input("Enter the upper value:"))
for number in range(m,n+1):
    if number>1:
        for i in range(2,number):
            if (number%i)==0:
                break
        else:
            print(number,end="  ")