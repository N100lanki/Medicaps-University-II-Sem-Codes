'''Write a function count_letter (word, letter) which takes a word & letter as
arguments and returns the number of occurrences of that letter in a word.'''
from itertools import count


def countLetter(word, letter):
    count = 0
    if letter in word:
        for i in word:
            if i in letter:
                count += 1
    else:
        print("Not Found")
    count=word.count(letter) #   Second Way of doing the same thing
    return count

word = input("Enter the word :")
letter = input("Enter the letter : ")
print("Occurence of {} in {} is :".format(letter, word), countLetter(word, letter))