# Quadratic Equation
import cmath

print("Equation is ax^2 + bx+ c :")
a = float(input("Enter value of a:"))
b = float(input("Enter value of b:"))
c = float(input("Enter value of c:"))
disc = b ** 2 - 4 * a * c
square_root = cmath.sqrt(abs(disc))
if disc > 0:
    print(" real and different roots ")
    print((-b + square_root) / (2 * a))
    print((-b - square_root) / (2 * a))
elif disc < 0:
    print(" real and same roots")
    print(-b / (2 * a))
else:
    print("Complex Roots")
    print(-b / (2 * a), " + i", square_root)
    print(-b / (2 * a), " - i", square_root)