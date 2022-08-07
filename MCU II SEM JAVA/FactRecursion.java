import java.util.Scanner;
class FactRecursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n *fact(n-1);
        }
    }
    public static void main(String [] A){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        System.out.println("The factorial of x is :"+fact(x));
    }
    
}
