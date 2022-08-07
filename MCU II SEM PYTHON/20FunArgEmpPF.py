'''20. Write a function that takes any two arguments. One argument is the name
of the employee and the other argument is the PF. The default PF is 30000.
'''
def Employee(name,PF=30000):
    print(f"the name of employee is {name} and PF is {PF}" )
name=input("Enter Name: ")
#PF=float(input("Enter PF Amnt:"))
Employee(name)