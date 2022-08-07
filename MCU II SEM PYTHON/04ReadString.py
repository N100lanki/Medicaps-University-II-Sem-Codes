# Read a string from a user and print string by removing spaces present in string.
a= input("Enter The string:")
def remove(a):
    return a.replace(" ", "")
print(remove(a))