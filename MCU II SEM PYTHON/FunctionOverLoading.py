#function overloading

def add(a,b):
	res=a+b
	print("function 1st Called ")
	print("Add =",res)


def add(a,b,c):
	res=a+b+c
	print("Function 2nd Called ")
	print("Add =",res)

#add(10,20) #Error
add(10,20,30)
add(10,20)
'''#function overloading

def add(a,b):
	res=a+b
	print("Add =",res)

add(10,20)

def add(a,b,c):
	res=a+b+c
	print("Add =",res)


add(10,20,30)
'''
