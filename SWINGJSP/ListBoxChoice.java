import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener, ItemListener{
    List l;
    Choice c;
    TextArea ta;
    public MyFrame(){
        super(" Demo");
        l=new List(4,true);
        c=new Choice();
        ta = new TextArea(20,30);
        setLayout(new FlowLayout());
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wedday");
        l.add("Thusday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("Fab");
        c.add("March");
        c.add("April");
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);


    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l)
        ta.setText(l.getSelectedItem());
        else 
        ta.setText(c.getSelectedItem());
    }
    public void actionPerformed(ActionEvent ae){
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
            txt=x+"\n";
        ta.setText(txt);

    }
}
public class ListBoxChoice {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setSize(600,600);
    f.setVisible(true);
  }  
}
