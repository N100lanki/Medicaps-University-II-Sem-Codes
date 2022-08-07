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
class c extends a{
    void methodC(){
        System.out.println("Method of class C");
    }

}
public class HiararchicalInheritance {
    public static void main(String[] args) {
        
        b obj1=new b();
        c obj2=new c();
        obj1.methodA();
        obj1.methodB();
        //obj1.methodC();
        obj2.methodC();
    }
}
