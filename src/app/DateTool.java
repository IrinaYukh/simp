package app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTool {

    private static final Calendar calendar = Calendar.getInstance();

    public static Date addHoursToDate(int hoursToAdd)
    {
        return addHoursToDate(new Date(), hoursToAdd);
    }

    public static Date addHoursToDate(Date date, int hoursToAdd)
    {
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();
    }

    //------------------------------------------------------
    // Methods of conversion dateToString -> stringToDate

    public static String dateToString(Date date, String format)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateInMyFormat = simpleDateFormat.format(date);
        return dateInMyFormat;
    }

    public static Date stringToDate(String dateAsString, String format)
    {
        Date date1= null;
        try {
            date1=new SimpleDateFormat(format).parse(dateAsString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }
    //---------------------------------------
    // Метод добавления значения к текущему часу

    public static Date addHoursToNow(int hoursToAdd)
    {
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();
    }

    //-------------------------------------------------------------
    // Метод добавления значения к текущему количеству минут

    public static Date addMinuteToNow(int minutesToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, minutesToAdd);
        return calendar.getTime();
    }

    // Метод добавления значения к текущему значению дня

    public static Date addDayToNow(int daysToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
        return calendar.getTime();
    }

    //----------------------------Universal methods addition of the fields------------------
    // Универсальная функция добавления числового значения к полю времени (пример Calendar.Year)
    public static Date addToDate(int field, int ToAdd)
    {
        return addToDate(new Date(),field, ToAdd);
    }

    public static Date addToDate(Date date, int field, int ToAdd)
    {
        calendar.setTime(date);
        calendar.add(field, ToAdd);
        return calendar.getTime();
    }


    //--------------------- main --------------------------------------
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        now = addDayToNow(2);
        System.out.println(now);
        now = addHoursToNow(2);
        System.out.println(now);

        System.out.println("==================");
        Date date = addHoursToDate(3);
        System.out.println(date);
        Date currentDate = new Date();
        date = addHoursToDate(currentDate, 4);

        String dateInMyFormat = dateToString(new Date(), "dd/MM/yyyy");
        System.out.println(dateInMyFormat);

        Date example = stringToDate("2012-12-31","yyyy-MM-dd");
        System.out.println("String to Date:  " + example);


        Date misha1 = addToDate(Calendar.YEAR, -2);
        System.out.println("Misha1 " + misha1);
        Date misha2 = addToDate(new Date(1212121212121L), Calendar.MONTH, -15);
        System.out.println("Misha2 " + misha2);

    }


}
