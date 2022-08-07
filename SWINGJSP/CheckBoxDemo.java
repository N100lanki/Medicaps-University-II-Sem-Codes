import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame  implements ItemListener,ActionListner,WindowListener
{
    Label l;
    Checkbox c4, c1,c3,c2;
    CheckboxGroup cbg;
    public MyFrame()
    {
        super("CheckBoxes");
    l = new Label(" Nothing Selected");
    cbg= new CheckboxGroup();
    c1= new Checkbox("Java",false,cbg);
    c2= new Checkbox("Python",true,cbg);
    c3= new Checkbox("C#",false,cbg);
    c4= new Checkbox("DJango",false,cbg);
    // c1= new Checkbox("Java");
    // c2= new Checkbox("Python");
    // c3= new Checkbox("C#");
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
    addWindowListener(this);
     setLayout( new FlowLayout());
    add(l);
    add(c1);
    add(c2);
    add(c3);
    add(c4);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      String str ="";

      if(c1.getState())
      str = str+""+c1.getLabel();
      
      if(c2.getState())
      str = str+""+c2.getLabel();
      
      if(c3.getState())
      str = str+""+c3.getLabel();
      if(c4.getState())
      str = str+""+c4.getLabel();
      if (str.isEmpty())
        str="Nothing Is Selected Bruhhhh:";
      l.setText(str);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void windowClosing(WindowEvent e) {
      // TODO Auto-generated method stub
      System.exit(0);
      
    }

    @Override
    public void windowClosed(WindowEvent e) {
      
      // TODO Auto-generated method stub
      
    }

    @Override
    public void windowIconified(WindowEvent e) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void windowActivated(WindowEvent e) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
      // TODO Auto-generated method stub
      
    }
}
public class CheckBoxDemo{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
    }
}
