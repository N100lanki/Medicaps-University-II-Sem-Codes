import java.awt.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.text.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListner{
   

    public MyFrame(){
        super(" Demo");
    JTextField tf1 = new JTextField(15);
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    JFormattedTextField tf2 = new JFormattedTextField(df);
   tf2.setColumns(15);
   tf2.setValue(0);
   //NumberFormat nf = new NumberFormat.getInstance();
   NumberFormatter nft = new NumberFormatter();

   JFormattedTextField tf3 = new JFormattedTextField(nft);
   tf3.setColumns(15);
   nft.setAllowsInvalid(false);
   nft.setMaximum(20000);
    setLayout(new FlowLayout());
    add(tf1); 
    add(tf2);
    add(tf3);

}
}
public class Swing02TextAreas {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setVisible(true);
    f.setSize(600,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  
}
