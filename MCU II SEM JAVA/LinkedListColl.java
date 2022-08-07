import java.util.*;

public class LinkedListColl {

    public static void main(String[] args) {
        
        LinkedList<Integer> al1=new LinkedList <>();
        
        LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,20);
        al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,30);
        al1.set(6,40);
        al1.addFirst(05);
        al1.addLast(100);
        System.out.println("All Elements of AL1  :");
        al1.forEach(n->System.out.print((n+",")));
    }
}