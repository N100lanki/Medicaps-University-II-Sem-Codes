def circle():
    print("Area of  Circle")
    r =  float (input ("Please enter the radius of the given circle: ")) 
    pi=3.14
    area=pi*r*r
    print (area)
    print("-----------------------------------------------------------------")
def rectangle():
    print("Area of  rectangle")
    a = float(input('Enter first side: '))
    b = float(input('Enter second side: '))
    area=a*b
    print(area)
    print("-----------------------------------------------------------------")
def tringle():
    print("Area of  tringle")
    a = float(input('Enter first side: '))
    b = float(input('Enter second side: '))
    c = float(input('Enter third side: '))
    s = (a + b + c)/2
    area = (s*(s-a)*(s-b)*(s-c))
    print(area)
    print("-----------------------------------------------------------------")

circle()
rectangle()
tringle()