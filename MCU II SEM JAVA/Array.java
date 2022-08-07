import java.util.Scanner;
public class Array {
    public static void main(String[]A){

        System.out.println("enter arry elements:");
        Scanner sc=new Scanner(System.in);
        int []arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of Arry:");
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2)==0){
            System.out.print(" "+arr[i]);
           }
        }
    }
    
}
