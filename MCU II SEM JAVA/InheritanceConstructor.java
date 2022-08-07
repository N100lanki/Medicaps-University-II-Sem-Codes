class bese{
    int x=10;
    bese(){
        System.out.println("this is base class "+x);
    }
    bese(int y){
        System.out.println("Over loaded of base Class"+y);
    }
}
class derived extends bese{
    derived(){
        System.out.println("derived class ");
    }
    derived(int z){
       
    //super();
    System.out.println("Censtructor  (Peramiterd):"+z);

    }

}
public class InheritanceConstructor {
    public static void main(String[] args) {
       // bese obj = new bese(); 
        derived obj = new derived(0);
    }
    
}
