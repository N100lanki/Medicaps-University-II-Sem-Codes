import java.util.*;
import java.io.*;

public class StringTokenizer1 {
   

    public static void main(String[] args) {
        
         String data = "Name=Ninjan Address=Indore Country=India Dep IT;";
        StringTokenizer stk = new StringTokenizer(data," ");
        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        } 
    }
    
}
