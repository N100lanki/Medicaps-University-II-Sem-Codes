import java.util.Scanner;
public class SearchElementInArr {
    public static void main(String[]A){

        System.out.println("enter arry elements:");
        Scanner sc=new Scanner(System.in);
        int []arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched :");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(arr[i]==search){
         System.out.println("FOund at index :"+(i+1));
         }
        else{
            System.out.println("Element Not Found !!!");
        }
        }
    }
}
    

