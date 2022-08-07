# 29 Pattern Printing
#1
#12
#123
lim = int(input("Enter the quantity of lines :"))

for i in range(1, lim + 1):
    for j in range(1, i + 1):
        print(j, end=" ")
    print("\n")

print("------------------------")
for i in range(1, lim + 1):
    for j in range(1, i + 1):
        print(i, end=" ")
    print("\n")

print("------------------------")
import string

alphas = string.ascii_uppercase
for i in range(0, lim):
    for j in range(0, i + 1):
        print(alphas[j], end=" ")
    print("\n")

print("------------------------")
for i in range(0, lim):
    for j in range(0, i + 1):
        print(alphas[i], end=" ")
    print("\n")

print("------------------------")
for i in range(0, lim):
    for j in range(0, i + 1):
        print("* ", end=" ")
    print("\n")

print("------------------------")
for i in range(0, lim):
    for k in range(0, lim - i):
        print(end=" ")
    for j in range(0, i + 1):
        print(" *", end=" ")
    print("\n")