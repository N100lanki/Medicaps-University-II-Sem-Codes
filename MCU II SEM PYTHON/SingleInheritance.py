class parent1():
    def showA(self):
        print("Example of Single Inheritance: In Parent1 class")
class child(parent1):
    def showB(self):
        print("Example of Single Inheritance: In Child class")
obj=child()
obj.showA()
obj.showB()