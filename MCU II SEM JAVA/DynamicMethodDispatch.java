
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
public class DynamicMethodDispatch {
    public static void main(String [] X){
        a obj1=new b();       //Runs Methods of b
        obj1.methodA();
     //   obj1.methodB();         !Error cant call superclass's object child class methods

    }
    
}

    

