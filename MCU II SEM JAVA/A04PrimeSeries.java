import java.util.Scanner;
public class A04PrimeSeries {
    public static void main (String[] args)
    {   
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter Limit Strt From :");
        int s =sc.nextInt();
        System.out.print("Enter Limit up to:")	;
        int e =sc.nextInt();
        System.out.print("Prime Series:");
        int i =0;
        int num =0;
        for (i = s; i <= e; i++)         
        { 		  	  
           int counter=0; 	  
           for(num =i; num>=1; num--)
           {
                 if(i%num==0)
                 {
                   counter = counter + 1;
                 }
           }
          if (counter ==2)  System.out.print(" "+i);
          	
        }	
    }
 }

