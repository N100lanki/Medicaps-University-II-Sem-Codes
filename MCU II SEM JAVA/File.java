import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try {
        FileOutputStream fos = new FileOutputStream(" Test.txt");
        String str = "Learn Java IOStreams ";
        byte b[]=str.getBytes();
        try {
               //fos.write(str.getBytes());
               fos.write(b);
                fos.close();
            } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
    }
    catch (FileNotFoundException e)
    {
        System.out.println("File not found "+e);
    }
}
    
}
