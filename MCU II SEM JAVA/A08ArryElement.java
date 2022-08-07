import java.util.Scanner;
public class A08ArryElement {
    public static void main(String[]A){

        System.out.println("enter arry elements:");
        Scanner sc=new Scanner(System.in);
        int []arr = new int[3];
        int flag=0;
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched :");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(arr[i]==search){
            flag=1;
         System.out.println("FOund at index :"+(i));
         break;
         }
        }
        if(flag==0){
            System.out.println("Element Not Found !!!");
        }
    }
    
}
