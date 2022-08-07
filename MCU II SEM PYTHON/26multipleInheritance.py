'''26. Write a program to override Display () method in multiple inheritance using super ().'''
class ADD1:
    def __init__(self ,a ,b):
        self.a=a
        self.b=b
    def add(self):
        print("Performing addition in 1 parent class",self.a+self.b)
class ADD2:
        def add(self,):
          super().add()
          print("Performing addition in 2 parent class",self.a+self.b)
class ADD3(ADD1,ADD2):
    def add(self):
        super().add()
        print("Performing addition in child class",self.a+self.b)
a=input("Enter number")
b= input("enter number")
obj=ADD3(a,b)
obj.add()