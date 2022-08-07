public class Generics {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        //obj = new Integer(10);
        String str = (String)obj;
    System.out.println(str);
    }
    
}
