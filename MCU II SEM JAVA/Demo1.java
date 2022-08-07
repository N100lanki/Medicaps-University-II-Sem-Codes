import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Demo1 {
   public static void main(String args[]) {
      NumberFormat numFormat = new DecimalFormat();
      int i = Integer.MIN_VALUE;
      System.out.println(i);
      numFormat = new DecimalFormat("0.######E0");
      System.out.println(numFormat.format(i));
      numFormat = new DecimalFormat("0.#####E0");
      System.out.println(numFormat.format(i));
      double val = 0.37872;
      numFormat = new DecimalFormat("0.#####E0");
      System.out.println(numFormat.format(val));
      numFormat = new DecimalFormat("000000E0");
      System.out.println(numFormat.format(val));
   }
}