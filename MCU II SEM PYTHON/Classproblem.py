#20/04/2022 Task Himanshu sir
from re import I


'''class Calculate:
    def __init__(self,X,Y):
        self.X=X
        self.Y=Y
    def add(self):
        print("Addition:",(self.X+ self.Y))
    def sub(self):
        print("Subtraction:",(self.X-self.Y))
    def Divi(self):
        print("Division:",self.X / self.Y)
    def rem(self):
        print("Remender:",self.X % self.Y)
    def mul(self):
        print("Multiplication:",self.X * self.Y)
X=int(input("Enter A NO.:"))
Y=int(input("Enter A NO.:"))
Cal= Calculate(X,Y)
Cal.add()
Cal.sub()
Cal.Divi()
Cal.rem()
Cal.mul()
'''
class Calculate2:
    def __init__(self,*X):
        self.A=X
    def add(self):
        sum=0
        for i in self.A:
            sum+=i
        print("Addition of N Number:",sum)
    def multi(self):
            
        sum=1
        for i in self.A:
            sum=sum*i
        print("Multiplication of N Number:",sum)
    def sub(self):
        sub=self.A[0]
        for i in self.A:
            sub=sub-i
        print("Subtraction of N Number:",sub)
Cal2=Calculate2(10,20,30,40,50,60)
Cal2.add()
Cal2.multi()
Cal2.sub()

