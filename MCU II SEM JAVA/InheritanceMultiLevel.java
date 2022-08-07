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
class c extends b{
    void methodC(){
        System.out.println("Method of class C");
    }

}
public class InheritanceMultiLevel {
    public static void main(String[] args) {
        c obj=new c();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        b obj2 =new b();
        obj2.methodA();
        obj2.methodB();
        

    }
    
}
