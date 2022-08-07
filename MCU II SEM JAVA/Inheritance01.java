//Single inheritance
class a{
    void methodA(){
        System.out.println("Method of class A");
    }
}
class b extends a{
    void methodB(){
        System.out.println("Method of class B");
    }
}
public class Inheritance01 {
    public static void main(String [] X){
        b obj1=new b();
        obj1.methodA();
        obj1.methodB();
     //   obj1.methodB();         !Error cant call superclass's object child class methods

    }
    
}
