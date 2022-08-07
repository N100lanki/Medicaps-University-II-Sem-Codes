'''program to read password from user. If user types the correct password i.e. ‘Python’ then
displays the message ‘Welcome to python’. Note:-Only 3 attempts are allowed to enter
password.'''
original = "Python"
count = 3
while count > 0:
    print(count, " attempts remaining.")
    userpass = input("Enter Password :")
    if userpass == original:
        print("Welcome to python.")
        count = 0
    else:
        print("Wrong password!")
        if count != 1:
            print("Please try again!")
            print()
        count = count - 1
