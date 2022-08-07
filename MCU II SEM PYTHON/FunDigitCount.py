def digit(num):
    flag=False
    counting= [{0:"Zero",1:"One",2:"Two",3:"Three",4:"Four",5:"Five",6:"Six",7:"Seven",8:"Eight",9:"Nine"},{1:"Ten",2:"Twenty",3:"Thirty",4:"Fourty",5:"Fifty",6:"Sixty",7:"Seventy",8:"Eighty",9:"Ninty"},{1:"Eleven",2:"Twelve",3:"Thirteen",4:"Fourteen",5:"Fifteen",6:"Sixteen",7:"Seventeen",8:"Eighteen",9:"Nineteen"}]
    print(counting[0][int(num[0])],"Thousand",counting[0][int(num[1])],"Hundred",end=" ")
    if int(num[2]) ==1:
        print(counting[2][int(num[3])],end=" ")
        flag=True
    else :
        print(counting[1][int(num[2])],end=" ")
    if not flag:      
        print(counting[0][int(num[3])],end=" ")
num=input("Enter a number upto 4 digits: ")
digit(num)