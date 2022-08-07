import java.util.Scanner;

public class Searcharry {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,5,6,5,2};
        int flag=0, i, n=5;
        for(i=0;i<13;i++)
        {
            if (a[i] == n){
                flag=1;
                System.out.println("Element found at location "+(i+1));

            }
            
        }
        if (flag==0){
            System.out.println("Element is not found in Arry ");
        }

    }
    
}