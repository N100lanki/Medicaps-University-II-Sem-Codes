import java.util.Scanner;
 class Method {
     static int factorial(int a){

        int fact=1;
         for(int i=1;i<=a;i++)
           {
           fact=i*fact;    
           }
     return fact;
     }
    public static void main(String[] n)
    {
        System.out.print("Enter No. To found Factorial:");    
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.print("factorial:");
            System.out.print(factorial(a));
    }
 }
