str = input("Enter String :")
str1=''
index = int(input("Enter Index to remove char: "))
for char in range(0, len(str)):
	if(char != index):
		str1+= str[char]
print(str1)