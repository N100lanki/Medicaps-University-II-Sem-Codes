import java.awt.*;
class MyFrame extends Frame{
    Label l ;
    TextField tf;
    Button b;
    public MyFrame(){
        super (" My App");
        setLayout( new FlowLayout() );
         l = new Label("Name");
         tf = new TextField(20);
         b = new Button("ok");
         add(l);
         add(tf);
         add(b);
    }
}
public class OwnFrameDev {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
