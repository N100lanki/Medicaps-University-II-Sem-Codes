class figure
{
int dim1,dim2;
figure()
{

System.out.println("01figure calss constructor calling.......");
}
void area(int x,int y)
{
    dim1=x;
System.out.println("01 Area of circle "+(3.14*dim1*dim1));
}

}
class rectangle extends figure
{
rectangle()
{

System.out.println("03 rectangle class constructor calling....");
}
void area(int x ,int y)
{
dim1=x;
dim2=y;
System.out.println("area of rectangle ="+dim1*dim2);
}
}
class triangle extends figure
{
triangle()
{
System.out.println("05 triangle class constructor calling.... ");
}
void area(int x ,int y)
{
dim1=x;
dim2=y;
System.out.println("area of triangle="+(0.5*dim1*dim2));
}
}
class A20Dispatch
{
public static void main(String args[])
{
figure obj=new figure();
rectangle obj1=new rectangle();
triangle obj2=new triangle();

figure r;//create reference
r=obj;
r.area(10,2);
r=obj1;
r.area(2,4);
r=obj2;
r.area(2,6);
}
}