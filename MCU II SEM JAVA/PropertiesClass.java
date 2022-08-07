import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p = new Properties();
       /*  p.setProperty("Brand","DELL");
        p.setProperty("Proccesor","I7/12");
        p.setProperty("OS","Win11");
        p.setProperty("Model","LAtitude");
        p.store(new FileOutputStream("MyData.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("MyData.XML"), "Laptop");*/
        //p.loadFromXML(new FileInputStream(("MyData.xml")));
        p.load(new FileInputStream(("MyData.txt")));
        System.out.println(p.getProperty("Brand"));
        System.out.println(p);
    }
    
}
