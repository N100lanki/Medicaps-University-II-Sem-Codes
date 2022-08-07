abstract class a{
    abstract void methodA();
    void ninjan(){
        System.out.println("This is abstract class");
    }
        
    
}
class b extends a{
    void methodA(){
        int i=100;
        System.out.println("Method of class B");
    }
}
class c extends a{
    void methodA(){
        System.out.println("Method of class c");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        //a  obj = new a();     error cant craete object of abstract class  
        c obj1 =new c();
        b obj2 =new b();
        obj1.methodA();
        obj2.methodA();
        obj1.ninjan();
        obj2.ninjan();
        System.out.println(obj1);  
    }   
}
