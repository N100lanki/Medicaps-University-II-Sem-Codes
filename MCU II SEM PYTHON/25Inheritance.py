'''25. Write a program to inherit attributes of the parent class to a child class.
'''
import math
class GetRadius:
    def __init__(self,r):
        self.radius=r
class CalculateArea (GetRadius ):
    def area(self):
        print("area of circle is :",math.pi*self.radius*self.radius)
r=float(input("Enter Radius :"))
obj=CalculateArea(r)
obj.area()