''' Write a program to read strings and display total numbers of uppercase & lowercase
letters.'''
uppercase, lowercase, other = 0, 0, 0
string = input("Enter String")
for i in range(len(string)):
    if string[i] >= "a" and string[i] <= "z":
        lowercase += 1
    elif string[i] >= "A" and string[i] <= "Z":
        uppercase += 1
    else:
        other += 1
total=lowercase+uppercase+other
print("Lower =", lowercase)
print("Upper =", uppercase)
print("other=", other)
print("Total Char=", total)