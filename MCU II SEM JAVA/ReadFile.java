import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
      
        try(  FileInputStream fis = new FileInputStream(" Test.txt"))
        
         {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println("File Is "+str);
            fis.close();
            
    }
   
     catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    
}
