import java.util.Scanner;
public class A06ConcatString {
    public static void main(String[] a)
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Strings:");
        String s1 =sc.nextLine();
        System.out.print("Enter Strings:");
        String s2 =sc.nextLine();
        String s3 = s1.concat(s2);
        System.out.println("String s3 After Concatination:"+s3);
}
}
