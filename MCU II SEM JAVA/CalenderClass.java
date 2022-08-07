import java.util.*;
public class CalenderClass {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println("Time Zone :"+tz.getID());


            
        
        System.out.println(gc.isLeapYear(2022));
       // System.out.println(gc.get(Calender.DAY_OF_WEEK));

    }
}
