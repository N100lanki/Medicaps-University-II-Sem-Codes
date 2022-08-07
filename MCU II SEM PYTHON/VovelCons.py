string = input("Enter String ::")
Vovel=0 
Cons=0
other=0
for i in str(string):
    if  i== "a" or i== "i" or i=="o" or i=="u" or i=="e" or i== "A" or i== "I" or i=="O" or i=="U" or i=="E" :
        Vovel+=1
    elif i >= "A" and i <= "Z":
        Cons+=1
    elif i >= "a" and i <= "z":
        Cons+=1
    else:
        other+=1     
print("Vovels :",Vovel)
print("Consonant :",Cons)
print("Others  :",other)