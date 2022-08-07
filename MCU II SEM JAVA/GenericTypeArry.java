//Generics Right Program
public class GenericTypeArry<t> {
    t data [] = (t[]) new Object[3];
    public static void main(String[] args) {
        GenericTypeArry<String>gd = new GenericTypeArry<>();
        gd.data[0]="hello";
        gd.data[1]="hii";
        //gd.data[2]=10;
        //gd.data[2]=new Integer(10);
        String str = gd.data[0];
        String str1 = gd.data[1];
        String str2 = gd.data[2];
    }


    
}
