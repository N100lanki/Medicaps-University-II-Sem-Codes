import java.util.*;


public class TreeMap1 {
    public static void main(String[] args) {
        
        TreeMap <Integer ,String > tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
        tm.put(3,"D");
        tm.put(4,"E");
        System.out.println(tm.ceilingEntry(3).getValue());
        tm.get(3);
        System.out.println("Keys and values :"+tm);

    }
    
}
