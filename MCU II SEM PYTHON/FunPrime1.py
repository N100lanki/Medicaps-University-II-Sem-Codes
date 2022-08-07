#  Prime or not
def Prime(n):
    i = 2
    flag=False
    while i ** 2 <= num:
        if num % i == 0:
            flag = True
        i += 1
    return flag
num = int(input("Enter a number to check prime or not:"))
flag1 =Prime(num)
print("Prime!") if flag1 == flag1 else print("Not Prime!")