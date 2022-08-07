#  Prime series using For Else
m=int(input("Enter Start From"))
n=int(input("Enter Start From"))
for x in range(m, n+1):
    for y in range(2, x // 2):
        if x % y == 0:
            break
    else:
        print(x, end=" ")