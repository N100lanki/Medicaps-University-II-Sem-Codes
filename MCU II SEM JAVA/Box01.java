import java.util.Scanner;

public class Box01 {
    int length;
    int width;
    int height;
    Box01()
    {
         this.length=30;
         this.width=20;
         this.height=30;
        System.out.println("Area of Rectangle(Default):"+(length*height*width));
    }
Box01(int l,int w, int h){
     length=l;
     width=w;
     height=h;
    System.out.println("Area of Rectangle(Perameterized Constructor):"+(length*height*width));
}
void volume(int l){
    System.out.println("Volum of Cube:"+(l*l*l));
}


void display(){
    System.out.println("Lenghth:"+length);
    System.out.println("Width:"+width);
    System.out.println("Height:"+height);

}
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the length:");
    int l= sc.nextInt();
    System.out.println("Enter the Width:");
    int w= sc.nextInt();
    System.out.println("Enter the height::");
    int h= sc.nextInt();
    Box01 obj =new Box01();
    obj.display();
    Box01 obj2 =new Box01(l,w,h);
    obj2.display();
    obj.volume(l);
  
    

}
    
}
