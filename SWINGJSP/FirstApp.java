import java.awt.*;
import javax.swing.ButtonGroup;
public class FirstApp {
public static void main(String[] args) {
    Frame f = new Frame(" Ninjan");
    f.setLayout( (new FlowLayout()));
    Button b = new Button("Hey Ninjan");
    Label l = new Label("Name ");
    TextField tf = new TextField(20);
    f.add(l);
    f.add(tf);
    f.add(b);
    f.setSize(300,300);
    f.setVisible(true);
    


}    
}
