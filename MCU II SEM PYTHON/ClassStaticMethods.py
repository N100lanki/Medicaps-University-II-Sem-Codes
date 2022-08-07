class test :
    count= 0
    def __init__(self):
        test.count=test.count+1
    @classmethod
    def noofobj(cls):
        print("the number of object in test class ",cls.count)
    @staticmethod
    def hello(name):
        print(f"hello {name}")
t1=test()
t1.noofobj()
test.hello(name="Ninjan")
t2=test()
t3=test()
t3.noofobj()