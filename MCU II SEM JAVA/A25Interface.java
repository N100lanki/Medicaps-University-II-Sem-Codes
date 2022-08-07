interface A1{
    int r=10;
    void getarea();
    void getperimeter();
}
class circle implements A1{
    public void getarea(){
        System.out.println("Area of circle :"+(3.14*r*r));
    }
   public  void getperimeter(){
        System.out.println("Perimeter Of Circle :"+(2*3.14*r));
    }
    public static void main(String[] args) {
        circle obj = new circle();
    obj.getarea();
    obj.getperimeter();
        
    }
}
public class A25Interface {

    
    
}
