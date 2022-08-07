#  Prime or not
i=2
print(i**2)
num = int(input("Enter a number to check prime or not:"))
flag = False
i = 2
while i ** 2 <= num:
    if num % i == 0:
        flag = True

    i += 1
print("Prime!") if flag == False else print("Not Prime!")