class MyThread1 extends  Thread{
    @Override
    public void run(){
        int n = 1;
        while (n==10){
            System.out.print("My Cooking Thread01  is Running ");
            System.out.println("And i am Happy ");
            n+=1;
        }

    }
}
class MyThread2 extends  Thread{
    @Override
    public void run(){
        int n = 1;
        while (n==10){
            System.out.print("My Study Thread02  is Running ");
            System.out.println("And i am very sad ");
            n+=1;
        }

    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
    
}
