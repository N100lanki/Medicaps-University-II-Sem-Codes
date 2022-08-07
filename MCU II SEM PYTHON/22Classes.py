'''21. Write a program that has class students with method subjects. Create two
subclasses: data science and computer science. Now access the method
subject explicitly with the class computer science and implicitly with the class
data science.'''
class student():
     def SubjectsData(self):
        self.SubjectD=['Python','Json','cloud computing']
        print("Data Science Subjects Are ",self.SubjectD)
        
     def SubjectsComp(self):
        self.SubjectC=['c','cpp','java']
        print("The Subjects of computer science",self.SubjectC)
class A(student):
    def x(self):
        student.SubjectsComp(self)
class B(student):
    def X(self):
        student.SubjectsData(self)
obj=student()
obj1=A()
obj2=B()
obj1.x()
obj2.X()
