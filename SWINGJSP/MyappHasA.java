import java.awt.*;
class myframe extends Frame{
    Label l;
    TextField tf;
    Button b;
    public myframe(){
        super("My App");
        setLayout (new FlowLayout());
        l = new Label("MY APP");
        tf = new TextField("Name");
        b = new Button("ok");
        add(l);
        add(tf);
        add(b);
    }
}
public class MyappHasA {
    public static void main(String[] args) {
    myframe f = new myframe();
    f.setSize(600,600);
    f.setVisible(true);

    }
}
