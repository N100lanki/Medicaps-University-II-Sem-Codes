class Test :
    def __init__(self):
        self.a=10
        self.b=10
        self.c=10
        self.d=10
    def display(self):
        print("A",self.a)
        print("C",self.c)
        print("B",self.b)
        print("D",self.d)

    def m(self):
        del self.d
#obj.Test()    !!NameError
#Test.display() !!Error  
obj=Test()
print("Before Delete Items:",obj.__dict__)
obj.display()
obj.m()
print("After  Delete Item D:",obj.__dict__)
print("---------------------------------Modifying---------------------------------")
obj.a=30
print("After  Modify  Item A:",obj.__dict__)
print("After  Modify  Item A:",obj.__dict__)
