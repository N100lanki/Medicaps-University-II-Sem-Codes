//3.0 Fibonacci Series
import java.util.Scanner;

public class A03Fibonacci {
    public static void main(String [] args){
        int  a=-1,b=1,c=0;
        System.out.print("Enter The Number of terms :");
        Scanner sc = new Scanner((System.in));
        int term = sc.nextInt();
        while(term >=0)
        {
         c=a+b;
         System.out.print(" "+c);
         a=b;
         b=c;
         term--;
        }
        sc.close();
    }
    
}
