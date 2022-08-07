import java.lang.*;
import java.util.ArrayDeque;
public class DequeArray {
    public static void main(String[] args) {
        ArrayDeque <Integer> dq = new ArrayDeque<>() ;
        dq.offerLast(70);
        dq.offerLast(80);
        dq.offerLast(90);
        dq.offerLast(100);
        dq.pollFirst();
        dq.pollFirst();
        //<Upr wala bahave like Queue and also oposite of it is a Queue
        dq.offerFirst(60);
        dq.offerFirst(50);
        dq.offerFirst(40);
        dq.offerFirst(30);
        dq.pollFirst();
        dq.pollFirst();
        //<it is act like a Stack and Oposite of it also a stack
        dq.forEach((x)->System.out.println(x));
    }
    
}
