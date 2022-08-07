class CmpOprDemo:
    def __init__(self,X):
        self.X = X
    def __add__(self,other):
        return self.X+other.X
    def __lt__(self,other):
        print(" The value of Ob1 =",self.X)
        print(" The value of Ob2 =",other.X)
        print(" Ob1 < Ob2 :",end="")
        return self.X <other.X
    def __gt__(self,other):
        print(" Ob1 > Ob2 :",end="")
        return self.X > other.X
    def __le__(self,other):
        print(" Ob1 <= Ob2 :",end="")
        return self.X <= other.X
Ob1 = CmpOprDemo(20)
Ob2 = CmpOprDemo(30)
print( Ob1 < Ob2 ) 
print( Ob1 > Ob2 )
print( Ob1 <= Ob2 )
print( Ob1 == Ob2 )
print( Ob1 + Ob2 )
