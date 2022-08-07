import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    public MyFrame(){
        super(" TextArea Demo");
        l=new Label(   " No Text Entered!!");
        ta=new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");
        Handler1 h1 = new Handler1();
        b.addActionListener(h1);
        setLayout(new CardLayout());
        add(l);
        add(ta);
        add(tf);
        add(b);
        
    }
    class Handler1 implements  ActionListener{
    public void actionPerformed(ActionEvent e){
     //l.setText(ta.getSelectedText()) ;  
        ta.append(tf.getText());
        }
}
}
public class TextAreaDemo {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setVisible(true);
    f.setSize(600,600);
  }  
}
