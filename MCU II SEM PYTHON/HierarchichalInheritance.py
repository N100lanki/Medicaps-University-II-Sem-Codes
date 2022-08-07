class Father():
    def showF(self):
        print("Example of Hierachical Inheritance: In Parent2 class")
class Child1(Father):
    def showA(self):
        print("Example of Hierachical Inheritance: In Child class")
class Child2(Father):
    def showB(self):
        print("Example of Hierachical Inheritance: In Child class")
class Child3(Father):
    def showC(self):
        print("Example of Hierachical Inheritance: In Child class")

obj1=Child1()
obj1.showA()
#obj.showB()    !Error Denge Because of Hierarchical Inheritance one child cant access the other childrens methods 
#obj.showC()    !Error Denge Because of Hierarchical Inheritance one child cant access the other childrens methods 
obj2=Child2()
obj2.showB()
obj3=Child3()
obj3.showC()