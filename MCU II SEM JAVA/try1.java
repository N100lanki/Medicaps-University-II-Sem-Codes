import java.util.Scanner;

/* Apply method overriding on class Figure having member variables dim1,dim2, constructor and 
area() member function. Extends two classes Rectangle and Triangle from Figure. Write 
constructor and area() function in Rectangle and Triangle class, apply dynamic method dispatch.
*/
class figure{
    float dim1,dim2;
    figure(){
        System.out.println("this is base class ");
    }    
    void area(int x ,int y){
        dim1=x;
        dim2=y;
        System.out.println("value of dim1 :"+dim1);
        System.out.println("value of dim2 :"+dim2);
    }
}
class Reactangle extends figure{
    Reactangle (){
        super();
        super.area(x,y);
        System.out.println("This is constructor of Reactangle class :");

    }
    void area(int x ,int y){
        dim1=x;
        dim2=y;
        System.out.println("area of Reactangle  :"+(dim1*dim2));
    }

    }
class triangle extends figure{
    triangle(){

        System.out.println("This is constructor of Triangle class :");

    }
    void area(int x ,int y){
        dim1=x;
        dim2=y;
        System.out.println("area of tringle :"+(0.5*dim1*dim2));
    }
}
public class try1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dim 1 & dim 2 ");
        int x = sc.nextInt();        
        int y = sc.nextInt();
        figure  obj1 = new triangle();
        obj1.area(x,y);
        figure obj2 = new Reactangle(x,y);         
        obj2.area(x,y);
    }
    
}
