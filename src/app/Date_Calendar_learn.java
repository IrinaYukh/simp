package app;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Calendar_learn
{
    public static void main (String[] args) throws InterruptedException {
        Date date1 = new Date();
        Date date3 = new Date();
        System.out.println("Date 1 : " + date1);


        Thread.sleep(2000);
        Date date2 = new Date();
        System.out.println("Date 2 : " + date2);
        System.out.println("-------------------");

        System.out.println("Is date1 before date2 - " + (date1.before(date2)));
        System.out.println("Is date1 after date2 - " + (date1.after(date2)));
        System.out.println("Is date1 equal date3 - " + (date1.equals(date3)));
        System.out.println("-------------------");

        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        Date dateCal = calendar.getTime();
        System.out.println(dateCal);

        Calendar calendar2 = new GregorianCalendar(2019, Calendar.JUNE, 22);
        System.out.println("calendar2 " + calendar2.getTime());











    }
}

