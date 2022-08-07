import java.util.Scanner;
public class A01Armstrong {
    public static void main(String [] a )
    {
    System.out.print("Enter The Number :");
    Scanner si = new Scanner(System.in);
    int n = si.nextInt();
    System.out.println("You Entered No is " + n);
    int sum=0;
    int last,temp=n;
    while(temp>0)
    {
      last=temp%10;
      sum+=last*last*last;
      temp=temp/10;
    }
    si.close();
    System.out.println(sum);
    if(n==sum)
    System.out.print(n+"Number is armstrong");
    else System.out.println(n+ " Number is not Armstrong");
    }
    
}
