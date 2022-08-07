class parent1():
    def showA(self):
        print("Example of Multiple Inheritance: In Parent1 class")
class parent2():
    def showB(self):
        print("Example of Multiple Inheritance: In Parent2 class")
class child(parent1,parent2):
    def showC(self):
        print("Example of Multiple Inheritance: In Child class")
obj=child()
obj.showA()
obj.showB()
obj.showC()
'''
#Function overriding using Inheritance
class parent1():
    def showA(self):
        print("Example of Multiple Inheritance: In Parent1 class")
class parent2():
    def showB(self):
        print("Example of Multiple Inheritance: In Parent2 class")
class child(parent1,parent2):
    def showA(self):
        print("Example of Multiple Inheritance: In Child class")
obj=child()
obj.showA()
obj.showB()
obj.showA()'''