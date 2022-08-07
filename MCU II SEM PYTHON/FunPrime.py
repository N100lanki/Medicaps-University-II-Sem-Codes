#  Prime series using For Else
m=int(input("Enter Start From"))
n=int(input("Enter Start From"))
def Prime(m,n):
    for x in range(m, n):
        for y in range(2, x // 2):
            if x % y == 0:
                break
        else:
            print(x, end=" ")

Prime(m,n)