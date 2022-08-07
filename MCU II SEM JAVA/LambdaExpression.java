@FunctionalInterface
interface MyLambda{
    public void display();
}
public class LambdaExpression {
    public static void main(String[] args) {
        
        MyLambda m=()->{System.out.println("Hello Lambda Ex...");};
        m.display();
    }
    
}
