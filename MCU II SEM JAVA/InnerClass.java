class Outer{
int x =10;
class Inner{
    void innerdisplay(){
        int y =20;
        System.out.println("The value of X"+x);
        System.out.println("The value of Y"+y);
    }

}
void outerdisplay(){
    System.out.println("The Outer Class's OuterDisplay Method Calling....");
}

}
public class InnerClass {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.outerdisplay();
        //How to call inner class methods
        Outer.Inner obj2 = new Outer().new Inner();
        obj2.innerdisplay();
    }
}
