import java.util.Scanner;
public class FibbonacciRecursion {
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String [] A){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        System.out.println("Fibonacci :"+fib(x));
    }
    
}

    
