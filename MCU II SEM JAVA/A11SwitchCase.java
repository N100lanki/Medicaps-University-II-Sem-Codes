//import java.net.SocketTimeoutException;
import java.util.Scanner;
public class A11SwitchCase {
    public static void main(String []A) {
    Scanner sc =new Scanner(System.in);
    boolean n = true;
    System.out.print("Enter The Value of a:");
    float a=sc.nextFloat();
    System.out.print("Enter the value of b:");
    Float b=sc.nextFloat();
    float c;
    while(n=true){
    System.out.println("1.Addition:- ");
    System.out.println("2.Subtraction:- ");
    System.out.println("3.Modulus:- ");
    System.out.println("4.Division:- ");
    System.out.println("5.Multiplication:-");
    System.out.println("6.To ReEnter The Values Of A & B:");
    System.out.println("0.Exit -");
    System.out.println("Enter Your Choice:-");
    int ch=sc.nextInt(); 
    switch(ch){
        case 1: c=a+b;
                System.out.println("Addition is :"+c);
                break;
        case 2: c=a-b;
                System.out.println("Subtraction is :"+c);
                break;
        case 3: c=a%b;
                System.out.println("Modulus is :"+c);
                break;
        case 4: c=a/b;
                System.out.println("Division is :"+c);
                break;
        case 5: c=a*b;
                System.out.println("Multipication is :"+c);
                break;
        case 6:System.out.print("Enter The Value of a:");
                a=sc.nextFloat();
               System.out.print("Enter the value of b:");
                b=sc.nextFloat();
               break;
        case 0: System.out.println("okk !! Tata Bye Bye !! Good Bye !!");
                System.exit(0);
        default:System.out.println("Enter Valid Choice !!");  
            }
   }
    
}
}
