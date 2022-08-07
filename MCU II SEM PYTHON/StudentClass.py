from unicodedata import name


class student :
    def __init__(self, sname,rollno,TOC,PY,JAVA,AFM,SEP,CNF):
        self.rollno=rollno
        self.name =sname
        self.AFM=AFM
        self.SEP=SEP
        self.JAVA=JAVA
        self.PY=PY
        self.CNF=CNF
        self.TOC=TOC
    def display():
        print("Name of Student :",self.name)
        print("ROl of Student :",self.rollno)
        print("AFM:",self.AFM)
        print("SEP:",self.SEP)
        print("TOC:",self.TOC)
        print("CNF:",self.CNF)
        print("JAVA:",self.JAVA)
        print("PY:",self.PY)
class total(student):
    self.total=self.AFM+self.SEP+self.PY+self.JAVA+self.CNF+self.TOC
    self.percent
    def total(self):
        print("Total=",self.total)
    def percent(self):
        self.percent=self.total

