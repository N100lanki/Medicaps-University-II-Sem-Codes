//package ADD;
public class Addition {

 void  sum(int x,int y){
     System.out.println("Addition is "+(x+y));
 } 
void  sub(int x,int y){
     System.out.println("Subtraction is "+(x-y));
 } 
void  multiplication(int x,int y){
     System.out.println("Multiplication is "+(x*y));
 } 
 void  division(int x,int y){
     try{
    System.out.println("division is "+(x/y));
     }
     catch (Exception  X){
         System.out.println("Divide by 0 Not Possible "+X);
     }
} 


 public static void main(String[] args) {
     
     Addition obj = new Addition();
     obj.sum(10,200);
     obj.sub(10000,200);
     obj.multiplication(10,200);
    obj.division(10, 0);
 } 
}
