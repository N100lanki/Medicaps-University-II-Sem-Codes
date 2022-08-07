@FunctionalInterface
interface MyLambda{
    public void display(String str);
}
public class LambdaExPRM {
    public static void main(String[] args) {
        
        MyLambda m=(s)->{System.out.println("Hello Lambda Ex Called by..."+s);};
        m.display("Ninjan");
    }
    
}