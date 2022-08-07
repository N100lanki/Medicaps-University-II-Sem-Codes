@FunctionalInterface
interface MyLambda{
    public int add(int a,int b);
}
public class LambdaADD {
    public static void main(String[] args) {

        MyLambda m =(a,b)->  a+b;
        int r=m.add(10,20);
        System.out.println("Addition:"+r);
    }
    
}