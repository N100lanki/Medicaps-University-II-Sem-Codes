''''Write a program to remove punctuations from a string.
Punc=’ “ ! (Write a function) – [ ] { } ; : ‘ “ \ . <> / @ ? $ # ^ & * % _ ~
‘ “'''
punch ='''–[]{};:‘“\.<>/@?$#^&*%_~‘“ '''
nopunch=""
str1=input("Enter string with punchs:")
for char in str1:
    if char not in punch:
        nopunch=nopunch+char
print(nopunch)