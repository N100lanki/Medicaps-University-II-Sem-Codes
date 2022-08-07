import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements  ActionListener{
JLabel l;
JButton b ;
int count=0;
MyFrame(){
    super("SwingDemo");
        
        l= new JLabel("Clicked "+ count + "Times ");
        b = new JButton("Click");
        //b1 = new JButton("Cancel");
         
        setLayout(new FlowLayout());
        getRootPane().setDefaultButton(b);
        add(l);
        add(b);
        //add(b1);
        b.addActionListener(this);
        b.setIcon(new  ImageIcon("C:\\Users\\91826\\OneDrive\\Pictures\\Medicaps Logo.png"));
        l.setToolTipText("Counter");

}
@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    count++;
    l.setText("Clicked "+ count + "Times ");
    
}
}
public class FirstSwing {
    public static void main(String[] args) {
       MyFrame f= new MyFrame();
       f.setSize(600,600);
       f.setVisible(true); 
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
