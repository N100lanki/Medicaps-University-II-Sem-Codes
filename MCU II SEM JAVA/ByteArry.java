import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArry {
    public static void main(String[] args) throws IOException {
        byte b[]={'a','b','c','c','e','f','g'};
        ByteArrayInputStream bis =new ByteArrayInputStream(b);
        //String str = new String(bis.readAllBytes());//useing this to read al at once 
        //System.out.println(bis.markSupported());
        int x;
        while ((x=bis.read())!=-1){
            System.out.println((char)x);
        }
        bis.close();
    }
    
}
