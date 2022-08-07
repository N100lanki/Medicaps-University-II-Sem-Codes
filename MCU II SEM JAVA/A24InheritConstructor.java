//Write a program explaining the concept of how constructors are called in inheritance.
class display{
    display ( ){
        System.out.println("Hello this is constructor from super class ");
    }
}
class show  extends display{
    void show(){
        System.out.println("In sub class of display class ");
    }

}
public class A24InheritConstructor {
    public static void main(String[] args) {
        show obj = new show();
        obj.show();

    }
    
}
