class GrandFather():
    def showA(self):
        print("Example of Multiple Inheritance: In Parent1 class")
class Father(GrandFather):
    def showB(self):
        print("Example of Multiple Inheritance: In Parent2 class")
class Child(Father):
    def showC(self):
        print("Example of Multiple Inheritance: In Child class")
    def __del__(self):
        print("Destroctor Invoked")
obj=Child()
obj.showA()
obj.showB()
obj.showC()
print(issubclass(Child,Father))
print(isinstance(obj,Child))