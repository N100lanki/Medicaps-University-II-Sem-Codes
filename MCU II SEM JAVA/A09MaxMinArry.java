import java.util.Scanner;
 class A09MaxMinArry {
    int max(int [] array) {
        int max = 0;
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]>max) {
              max = array[i];
           }
        }
        return max;
     }
    int min(int [] array) {
        int min = array[0];
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]<min) {
              min = array[i];
           }
        }
        return min;
     }
     public static void main(String [] X) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Arry:");
        int a =sc.nextInt();
        int []arr = new int[a];
        System.out.print("enter arry elements");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        A09MaxMinArry m = new A09MaxMinArry();
        System.out.println("Maximum value in the array is::"+m.max(arr));
        System.out.println("Minimum value in the array is::"+m.min(arr));
     }
   
    }

