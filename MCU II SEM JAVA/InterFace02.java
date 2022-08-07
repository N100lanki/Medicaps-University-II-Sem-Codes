import javax.swing.text.LayeredHighlighter;

interface Bicycle{
    int x = 10;          //Auto final by default
    void applybreak(int decreament);
    void speedup(int increament);


}
interface Horn {
    void blowhorn();
    default void Highlight(){};
}
class Cycle implements Bicycle,Horn{
    public void blowhorn(){
        System.out.println("Hat ja BSDK");
    }
    public void applybreak(int decreament){
        System.out.println("Applying breaks by :"+decreament+" M/S");
    } 
    public void speedup(int increament){
        System.out.println("Speeding your Bycyle By :"+increament+"M/s");
    }
    public void Highlight(){

    }
}
public class InterFace02 {
    public static void main(String[] args) {
        
    Cycle obj = new Cycle();
    obj.blowhorn();
    obj.speedup(20);
    obj.applybreak(10);
    }
    
}
