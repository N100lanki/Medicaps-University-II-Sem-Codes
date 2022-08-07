'''text="gmail@com"
l=len(text)
ntext=""
for i in range(0,1):
    if text [i].isupper:
        ntext=ntext+ntext[i].lower
    elif text[i].isalpha:
        ntext=ntext+ntext.upper
    else:
        ntext=ntext+"AB"
print(ntext)'''


'''for num in [20,14,15,16,17,18,19,20]:
    if num %2== 0:
        pass
    else :
        print(num)
'''
for i in range(1,3):
    for j in range(1,3):
        if i==j:
            continue
        print(i," ")