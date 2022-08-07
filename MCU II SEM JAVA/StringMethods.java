import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner ss =  new Scanner(System.in);
        String name = ss.nextLine() ; 
    System.out.println(name);
    int value=name.length();
    System.out.print("the length of the string is:");
    System.out.println(value);
    String lstring = name.toLowerCase(); // Return an lowercase string
    System.out.print("String in lower case is :");
    System.out.println(lstring);
    String  ustring = name.toUpperCase();// Return uppercase string
    System.out.print("String in Upper case is :");
    System.out.println(ustring);
    Scanner si = new Scanner(System.in);
    System.out.println("enter index where to start printing string");
    int index = si.nextInt();
    int des = si.nextInt();
    String subtring=name.substring(index , des); //Return substring Like Output(index - des-1)
    System.out.println(subtring);
    String nonTrimmedString = "       Ninjan       Solanki   ";
    System.out.print("Nontrimmed String::");
    System.out.println(nonTrimmedString);
    String TrimmedString = nonTrimmedString.trim(); // return string with removing spacces before string
    System.out.print("Trimed String is :");
    System.out.println(TrimmedString);
    String s1="Harry";
    System.out.print("Replace method calling Harry to :");
    System.out.println(s1.replace('r','p')); // replace a chracter and return string
    System.out.print("Replace method calling of Substring  Harry to :");
    System.out.println(s1.replace("rry", "ppy"));//replace a substring and return string
    System.out.print(" string is started with Ha  Harry true /False  :");
    System.out.println(s1.startsWith("Ha"));// return bolian if string startwith given word
    System.out.print("string is started with Ha   true /False  :");
    System.out.println(s1.endsWith("Ha"));// return bolian if string endwith given word
    System.out.print("Available char at index 2::");
    System.out.println(s1.charAt(2));// return placed char on given index
    String s2="Harryrry";
    System.out.print("index of ry after index 4 ::");
    System.out.println(s2.indexOf("ry",4));// return index of starting the substring
    System.out.print("last index ");
    System.out.println(s2.lastIndexOf("ry"));
    System.out.print("Equality Cheack of s1 s2::");
    System.out.println(s1.equals(s2));
    System.out.print("Equality Cheack of s1 to Harry with ignoring case :");
    System.out.println(s1.equalsIgnoreCase("harry"));
    System.out.print("Equality Cheack of \"s1\" tos\"2\"");

     
}

}