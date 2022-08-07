from traceback import print_tb


car=["BMW","Toyota","Audi","SuZukI"]
print(car)
car.sort()
print("Shorted Car:",car)
print("---------------------------------------")
car.sort(reverse=True)
print("Shorted Car Reverse :",car)
print("Shorted Car Duplicate :",sorted(car))
print("lenghth of list is :",len(car))
print(id(car))
print("---------------------------------------")
list1=[10,20,30,40,50,60,70,80,90,100]
print(list1)
print("Minimum:",min(list1))
print("Maximum:",max(list1))
print("Minimum:",sum(list1))
list2=car+list1
print("Concatination of list car + list1:",list2)
print("---------------------------------------")
x=[10,20,30,50,60]
y=[10,20,30,50,60]
z=[0,1,2,3,4,5,6,7]
print("x==y",x==y)
print("x==z",x==z)
print("x<=y",x<=y)
print("x>y",x>y)