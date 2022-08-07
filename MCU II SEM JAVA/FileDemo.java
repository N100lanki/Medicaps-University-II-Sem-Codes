import java.io.*;

public class FileDemo 
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
       File f=new File("TEST1.txt");
       
       System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       for(File x:list)
       {
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}