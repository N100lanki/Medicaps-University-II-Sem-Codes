import java.util.Scanner;
class Shape{
    int l ;
    int b;
    float h;
     Shape(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Lenghth:");
         this.l=sc.nextInt();
         System.out.println("Enter Width:");
         this.b=sc.nextInt();
         System.out.println("Enter Height:");
         this.h=sc.nextInt();
         
       
       
    }

}
class Reactangle extends Shape{
   void  ReactangleA(){
        int are=l*b;
        System.out.println("Area of Reactangle:"+are);
    }

}
class triangle extends Shape{
    void triangleA (){
        float Are=(float) (0.5*l*b);
        System.out.println("Area of Triangle:"+Are);
    }

}

public class BShape {

    public static void main(String[] args) {
        
        
       
        Shape ob= new Shape();
        Reactangle obj =new Reactangle();
        obj.ReactangleA();
        triangle obj2 = new triangle();
        obj2.triangleA();
    }
}




