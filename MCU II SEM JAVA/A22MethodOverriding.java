import java.util.Scanner;
class A{
    void display(int x,int y,int z){
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        System.out.println("ADDITION OF x,y,z (in class A)"+(x+y+z));

    }
}
class B extends A{
    void display(int x,int y,int z){
        super.display(x, y, z);

        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        System.out.println("ADDITION OF x,y,z (in class B):"+(x+y+z));

    }
}
public class A22MethodOverriding
 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 Numbers to Add ");
      int x=sc.nextInt();  
      int y=sc.nextInt();  
      int z=sc.nextInt();  
      B obj =new B();
      obj.display(x,y,z);
      
    }
}