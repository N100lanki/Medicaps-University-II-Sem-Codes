import java.util.Scanner;
import java.lang.*;
public class A16GetPutDataEmployee {
    String Name = new String();
    int Sallary ;
     void GetData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sallary.");
        Sallary=sc.nextInt();
        System.out.println("Enter Name :");
        Name=sc.next();
    }
     void PutData(){
        System.out.println("Name of Employee is :"+Name);
        System.out.println("Sallary   of Employee is :"+Sallary);
    } 
public static void main(String [] X){

    A16GetPutDataEmployee ob = new A16GetPutDataEmployee();
    ob.GetData();
    ob.PutData();

  
    
}
}

