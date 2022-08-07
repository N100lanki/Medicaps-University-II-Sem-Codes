def re_sum(n):
   if n <= 1:
       return n
   else:
       return n + re_sum(n-1)
num = int(input("Enter Number:"))
if num < 0:
   print("Enter a positive number")
else:
   print("The sum is",re_sum(num))