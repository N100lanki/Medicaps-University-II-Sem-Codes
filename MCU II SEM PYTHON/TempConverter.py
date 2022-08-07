ch = input("What do you want to convert F or C :")
if ch == "F" or ch == "f":
    fahrenheit = float(input("Enter temperature in fahrenheit: "))
    print("Temperature in Celcius is : %.2f" % ((fahrenheit - 32) * 5 / 9))
elif ch == "C" or ch == "c":
    celcius = float(input("Enter temperature in Celcius: "))
    print("Temperature in Fahrenheit is : %.2f" % ((celcius * 9 / 5) + 32))
else:
    print("Enter correct choice.")