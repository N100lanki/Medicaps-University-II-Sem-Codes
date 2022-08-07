import java.util.Scanner;
public class SumOfArry {
    


    public static void main(String[]A){

        System.out.println("enter arry elements:");
        Scanner sc=new Scanner(System.in);
        int []arr = new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of Arry:");
        for(int element :arr){             //For Each Loop
            System.out.print(element);
           }
           System.out.println();
           for(int i=0;i<arr.length;i++){
           sum+=arr[i]; 
        }
        System.out.println("Sum of all Elements:"+sum);
    }
}
    

