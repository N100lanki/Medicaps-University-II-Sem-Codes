import java.util.*;
public class HashTableLagacy {
    public static void main(String[] args) {
        //Hashtable ht = new Hashtable<>();
        Hashtable<Integer , String> ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        String s = (String)ht.get(3);
        Enumeration e = ht .elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        //ht.compute(2,(k,v)->v+"z");
        ht.computeIfAbsent(7,(k)->"z"+k);

        System.out.println("Value pair "+ht);

    }
}
