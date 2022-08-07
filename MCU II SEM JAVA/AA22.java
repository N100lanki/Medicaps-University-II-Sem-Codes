class A{
    void display(int x){
        System.out.println("The value of x in parent class :"+x);
    }
}
class B extends A{
    void display(int x){
        super.display(10);
        // System.out.println("the value of x in child class "+x);
    }
       
       
    }
public class AA22 {    
    public static void main(String[] args) {
    B obj = new B();
    obj.display(11);
}
    
}
