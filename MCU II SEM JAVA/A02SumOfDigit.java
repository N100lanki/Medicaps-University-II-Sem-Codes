//2. Find sum of digits of a number
import java.util.Scanner;
 class A02SumOfDigit {
public static void main(String []a)
{
    System.out.print("Enter The Digit:");
    Scanner sc= new Scanner(System.in);
    int digit = sc.nextInt();
    int sum=0,rem;
    while(digit>0)
    {
        rem=digit%10;
        sum+=rem;
        digit=digit/10;
    }
    System.out.println("The Sum Of Digit Is :"+sum);
    sc.close();
}     
}
