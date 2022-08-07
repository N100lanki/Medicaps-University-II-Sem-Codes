import java.lang.*;
import java.util.List;
import java.util.TreeSet;
class Point<object> implements Comparable {
    int x;
    int y;
    public Point (int x,int y){
        this.x=x;
        this.y=y;

    }
    public String toString(){
        return "x="+x+"y="+y; 
    }
    public int caompareTo(object o){
        Point p = (Point )o;
        if(this.x<p.x)
            return -1;
        else if (this.x>p.x)
            return 1;
        else {
            if (this.y<p.y)
            return -1 ;
            else if (this.y>p.y)
            return 1;
            else 
            return 0;
            
        }
        
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
public class SetDemoCopatable {
    public static void main(String[] args) {
        
        TreeSet <Point> ts = new TreeSet<>();
       // SortedSet <Integer> ts = new SortedSet<>(List.of(10,20,30,40,50,10,20));
       ts.add(new Point(1,1));
       ts.add(new Point(5,5));
       ts.add(new Point(5,2));
        System.out.println("Objects :"+ts);
}
}
