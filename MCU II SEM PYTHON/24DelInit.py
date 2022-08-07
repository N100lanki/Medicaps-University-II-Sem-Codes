''' Write a program to illustrate the use of __init__ and __del__ method.'''
#from re import X


class Test:
    def __init__(self ,x,y):
        self.x=x
        self.y=y 
    def add(self):
        print("addition x y is ",self.x+self.y)
    def __del__(self):
        print("del called ")
obj = Test(10,20)
obj.add()
del obj
print("Object Deleted :",c)
print(obj)