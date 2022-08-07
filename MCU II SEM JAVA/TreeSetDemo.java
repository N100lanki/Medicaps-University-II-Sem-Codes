import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet <Integer> ts = new TreeSet<>(List.of(10,20,30,40,50,10,20));
       // SortedSet <Integer> ts = new SortedSet<>(List.of(10,20,30,40,50,10,20));
        ts.add(25);
        System.out.println("Ceiling"+ts.ceiling(20));
        System.out.println("Flooring"+ts.floor(20));
        System.out.println("Contains"+ts.contains(70));
        System.out.println("Objrcts in Tre set"+ts);

    }
    
}
