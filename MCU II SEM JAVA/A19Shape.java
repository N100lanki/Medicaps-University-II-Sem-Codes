import java.util.Scanner;
class Shape{
    int l;
    int b;
    float h;
    void ShapeA(int x,int y,float z){
        this.l=x;
        this.b=y;
        this.h=z;
       
    }

}
class Reactangle extends Shape{
    void area(){
        int are=l*b;
        System.out.println("Area of Reactangle:"+are);
    }

}
class triangle extends Shape{
    void area (){
        float Are=(float) (0.5*l*b);
        System.out.println("Area of Triangle:"+Are);
    }

}

public class A19Shape {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Lenghth:");
        int x =sc.nextInt();
        System.out.println("Enter Width:");
        int y =sc.nextInt();
        System.out.println("Enter Height:");
        float z= sc.nextFloat();
        Reactangle obj =new Reactangle();
        obj.ShapeA(x,y,z);
        obj.area();
        triangle obj2 = new triangle();
        obj2.ShapeA(x,y,z);
        obj2.area();
    }
}




