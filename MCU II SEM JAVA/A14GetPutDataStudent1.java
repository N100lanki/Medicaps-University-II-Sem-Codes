import java.util.Scanner;
import java.lang.*;
public class A14GetPutDataStudent1 {
    int RollNo;
    String Name = new String();
     void GetData(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Name :");
         Name=sc.next();
         System.out.println("Enter RollNo.");
         RollNo=sc.nextInt();
    }
     void PutData(){
        System.out.println("Name of Student is :"+Name);
        System.out.println("Roll Number  of Student is :"+RollNo);
    } 
public static void main(String [] X){

    A14GetPutDataStudent1 ob = new A14GetPutDataStudent1();
    ob.GetData();
    ob.PutData();


  
    
}
}
