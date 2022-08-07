''' Write the numbers from 1 to 20 to the output file WriteNumbers.txt.'''
f = open ('WriteNumbers.txt','w') ##you can also write here 'w' for create or writing into file
for i in range (1,21):
    f.write(str(i)+"\n")
f.close()
f1 = open ('WriteNumbers.txt','r')
print("\n content of file :: \n",f1.read())
f1.close()



