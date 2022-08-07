m1=float(input("Enter Maths Marks: "))
if m1>100:
    m1=float(input("Enter Valid  Maths Marks: "))
if m1>100:
    m1=float(input("Enter Valid  Maths Marks: "))
if m1>100:
    m1=float(input("Enter Valid  Maths Marks: "))

m2=float(input("Enter English Marks: "))
if m2>100:
    m2=float(input("Enter Valid  English Marks: "))
if m2>100:
    m2=float(input("Enter Valid  English Marks: "))
if m2>100:
    m2=float(input("Enter Valid  English Marks: "))

m3=float(input("Enter Physics Marks: "))
if m3>100:
    m3=float(input("Enter Valid  Physics Marks: "))
if m3>100:
    m3=float(input("Enter Valid  Physics Marks: "))
if m3>100:
    m3=float(input("Enter Valid  Physics Marks: "))
m4=float(input("Enter Chemistry Marks: "))
if m4>100:
    m4=float(input("Enter Valid  Chemistry Marks: "))
if m4>100:
    m4=float(input("Enter Valid  Chemistry Marks: "))
if m4>100:
    m4=float(input("Enter Valid  Chemistry Marks: "))
m5=float(input("Enter Hindi Marks: "))
if m5>100:
    m5=float(input("Enter Valid  Hindi Marks: "))
if m5>100:
    m5=float(input("Enter Valid  Hindi Marks: "))
if m5>100:
    m5=float(input("Enter Valid  Hindi Marks: "))
total=m1+m2+m3+m4+m5
avg=(total*100)/500
print("------------------------------------------")
print("Enter Maths Marks: ",m1)
print("Enter Maths Marks: ",m2)
print("Enter Maths Marks: ",m3)
print("Enter Maths Marks: ",m4)
print("Enter Maths Marks: ",m5)
print("-------------------------------------------")
print("Total=",total)
print("Percentage=",avg)
#print("Subject Math :{}\nSubject English :{}\nSubject Physics :{}\nSubject chemistry :{}\nSubject Hindi :{}\nTotal={} \nPercentsge={}".format(m1,m2,m3,m4,m5,total,avg))
dvg=0
if avg>=60:
    print("First Division")
    dvg=1
if avg<=59.4 and avg>=40:
   print("Second Division")
   dvg=2
if avg<40 and avg>35:
        print("Third Division")
        dvg=3
if m1<35 or m2<35 or m3<35 or m4<35 or m5<35:
    if m1<35:
        print("Got Supplemetry in Math*")
    if m2<35:
        print("Got Supplemetry in English*")
    if m3<35:
        print("Got Supplemetry in Physics*")
    if m4<35:
        print("Got Supplemetry in Chemistry*")
    if m5<35:
        print("Got Supplemetry in Hindi*")
if m1>35 and m2>35 and m3>35 and m4>35 and   m5>35:
    print("Pass in {} Division ".format(dvg))
else:
    print("Supplemetry")