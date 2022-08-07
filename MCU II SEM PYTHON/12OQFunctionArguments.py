'''13. Write a program to illustrate use of following types of function:-
(a) Implementation of positional arguments in a function.
(b) Implementation of keyword arguments in a function.
(c) Implementation of default arguments in a function.
(d) Implementation of variable length arguments.
'''
print('I. Default argument in function...')
def fun(a=10, b=20):
    print('Value of A: ',a)
    print('Value of B: ',b)
fun(99)

print('\nII. Keyword argument in function...')
def fun(a, b):
    print('Welcome,:',a ,'to',b)
fun(a=454556, b='Python.')

print('\nIII. Positional argument in function...')
def fun(a, b):
    print('Name=',a ,'& ID:',b)
fun('ABC',656779)

print('\nIV. Variable-length argument in function...')
def fun(*var):
    sum=0
    for i in var:
        sum=sum+i
    print('Sum:',sum)
fun(1,4)
fun(2,20,45)
fun(10,20,30)