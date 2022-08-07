def isPalindrome(list):
    if list == list[::-1]:
        return True
    else:
        return False


list = input("Enter the list elements to check it is palindrome or not :").split()

print(isPalindrome(list))