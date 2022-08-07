'''8. Consider a list with mixed type of elements such as l1=[1,’x’,4,5.6,’z’,9,’a’,0,4]. Create
another list l2 using list comprehension which consists of only integer elements present
within list l1.
'''
l1 = ["c", True, 5, "DSAFf", (4, 6), 7, "Hi", 8, 30]

l2 = [element for element in l1 if type(element) is int]
print(l2)