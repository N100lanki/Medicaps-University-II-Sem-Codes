'''. Write a program to print all the letters from word1 that also appear in word2.
'''
word1 = "Hello This IS Nirnjan"
word2 = "HeLLO tHis Ninjan"
for i in word1:
    if i in word2:
        print(i, end=" ")