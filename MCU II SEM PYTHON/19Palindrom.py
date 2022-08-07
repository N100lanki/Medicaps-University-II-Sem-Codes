'''19. Write a function is_Lst_palindrome(Lst) to check whether a list is
palindrome. Function should return true if the list is palindrome and false
if not palindrome.'''
def isPalindrome(list):
    if list == list[::-1]:
        return True
    else:
        return False


list =input("Enter the list elements : (separate by space) :").split()

print("Is palindrome:",isPalindrome(list))