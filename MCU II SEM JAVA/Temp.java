import java.util.Scanner;
public class Temp {
    
 
    public static void main(String[]A){

        System.out.println("enter arry elements:");
        Scanner sc=new Scanner(System.in);
        int []arr = new int[5];
       // int flag=0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched :");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(arr[i]==search){
            //flag=1;
            
         System.out.println("FOund at index :"+(i));
         break;
         }
        
        else{

        
        //if(flag==0){
            System.out.println("Element Not Found !!!");
            break;
        }
        }
    
    
}

}
