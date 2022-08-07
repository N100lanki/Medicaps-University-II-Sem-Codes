import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
    int count=0;
    Label l;
    Button b;
    
    public MyFrame()
    {
        super("Button Demo");
        
        l=new Label("    "+count);
        b=new Button("Click");
        Handler h = new Handler();        
        b.addActionListener(h);
        
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
        
        
    }
    class Handler implements  ActionListener{

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) 
        // TODO Auto-generated method stub
        {
            count++;
            l.setText("  "+count);
        }
    
    }
    
}


public class ActionListener01 
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);       
    }
}