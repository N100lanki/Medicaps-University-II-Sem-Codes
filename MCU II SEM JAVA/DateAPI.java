import java.util.*;
public class DateAPI {
public static void main(String[] args) {
    //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    //System.out.println(Long.MAX_VALUE);
    //Date d = new Date("1/1/180");
    Date d = new Date();
    //System.out.println("Todays Date :"+d);
    System.out.println("Todays Time :"+d.getTime());
    System.out.println("Todays Date :"+d.getDate());
    System.out.println("Todays Day :"+d.getDay());
    System.out.println("Todays Month :"+d.getMonth());
    System.out.println("Todays Year :"+d.getYear());
}    
}
