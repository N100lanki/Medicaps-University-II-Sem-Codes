class Test :
    count= 0;
    def __init__(self):
        Test.count=Test.count+1
    @classmethod
    def noofobjects(cls):
        print("The number of object created for test class",cls.count )
t1=Test()
t2=Test()
Test.noofobjects()
t3=Test()
t4=Test()
t5=Test()
t6=Test()
Test.noofobjects()
print("---------------------------------------------------------")
#class Method 
class animal:
    legs = 4
    @classmethod
    def walk (cls,name):
        print("{} walks with  {} legs ....".format(name ,cls.legs))
animal.walk("dog")
animal.walk('Cat')