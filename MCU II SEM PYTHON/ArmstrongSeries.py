def generateSeries():
	limit=int(input("Enter end limit of series\n"))
	print("Series of armstrong number")
	for n in range(111,limit+1): 
		a,b=n,0
		l=len(str(n))
		while n>0:
			d=n%10
			b+=(d**l)
			n//=10

		if a==b:
			print(a)
generateSeries()

