import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements  TextListener ,ActionListener {
Label l1,l2;
TextField tf;
public MyFrame(){
    super("TextField Demo");
    l1=new Label("No Text Entered");
    l2=new Label("Enter Text");
    tf=new TextField(20);
    tf.addTextListener((TextEvent e)->l1.setText(tf.getText()));;
    tf.addActionListener((ActionEvent e) -> l2.setText(tf.getText()));
    setLayout(new FlowLayout());
    add(l1);
    add(l2);
    add(tf);
 }
}
public class TextFieldDemo 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);       
    }
}


