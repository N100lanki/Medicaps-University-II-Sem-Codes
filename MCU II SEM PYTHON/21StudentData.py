'''21. Write a program to create class student and make two methods inside the class get information() 
to get and display info() to print information of the student.'''


class student ():
    def info(self):
        self.name=input("Enter Name :")
        self.age=float(input("Enter Age:"))
    def display(self):
        print(f"Name of student is {self.name} And Age {self.age}")
obj=student()
obj.info()
obj.display()


