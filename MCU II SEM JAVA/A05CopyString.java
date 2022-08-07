import java.util.Scanner;
public class A05CopyString {
    
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s1 =sc.nextLine();
        String s2 = "";
        StringBuffer obj = new StringBuffer(s1);
        System.out.println(obj);
        System.out.println("String S1 is :"+s1);
        System.out.print("String S2 is :"+s2);
    }
}