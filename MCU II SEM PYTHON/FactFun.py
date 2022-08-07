#function with argument & without return value

def calculateFactorial(n):
	f,i=1,1
	while i<=n:
		f*=i 
		i+=1
	print("Factorial :",f)


n=int(input("Enter Number To Find Factorial"))
calculateFactorial(n)


