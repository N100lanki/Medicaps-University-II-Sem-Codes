package Ninjan;
interface B{
    void display(int k);
}
class c  implements B{
    public void  display(int k){
        System.out.println("Value of a "+k);
    }
}
 public class Interface01  {
    
    public static void main(String[] args) {
        c obj = new c();
        obj.display(10);
    }  
}
