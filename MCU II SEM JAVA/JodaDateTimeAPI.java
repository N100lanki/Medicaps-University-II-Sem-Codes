import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class JodaDateTimeAPI {
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(21);
        System.out.println("HOURS"+d);
        //LocalDate dt = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        //LocalDate dt = LocalDate.now();
        //LocalDate dt = LocalDate.of(2020,Month.March,21);
        LocalDate dt = LocalDate.ofEpochDay(100);
        System.out.println("New date "+dt);
    }
}
