'''class Test :
    def setName(self,nm):
        self.Name=nm
    def getName(self):
        return self.Name
s=Test()
s.setName('Niranjan')
print(s.getName())'''
class myclass :
    b=100
    def Meth(self):
        self.a=10
    @classmethod
    def classMeth(cls):
        print(cls.b)
        print(myclass.b)
        print("class Methods ")
    @staticmethod
    def staticMethod(o1):
        print(o1.a)
        print("Accesing class variable in static method ",myclass.b)
        print("static method :")

o1 = myclass()
o1.Meth()
myclass.classMeth()
myclass.staticMethod(o1)
