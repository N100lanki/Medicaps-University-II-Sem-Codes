import java.util.Scanner;

interface user{
    int red=1,green=2,blue=3;
}
 class k implements user {
     void useswitch(int a){
         switch(a){
             case red: System.out.println("red");
             break;
             case green: System.out.println("green");
             break;
             case blue: System.out.println("blue");
             break;
             default: System.out.println("Wrong");
         }

     }
 
         public static void main(String[] args) {
             Scanner sc =new Scanner(System.in);
             System.out.println("Enter values");
             int a = sc.nextInt();
             k obj =new k();
             obj.useswitch(a);
         }

     }
    

