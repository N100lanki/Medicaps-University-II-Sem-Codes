import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListner{
    public MyFrame(){
        super(" Demo");
    }
}
public class 01Frames {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setVisible(true);
    f.setSize(600,600);
  }  
}
