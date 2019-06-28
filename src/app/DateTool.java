package app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTool {

    private static Calendar calendar = Calendar.getInstance();

    //----------------------------Universal methods addition of value to the field------------------
    // Method for adding value to the time field (example Calendar.Year)
    public static Date addToDate(int field, int valueToAdd)
    {
        return addToDate(new Date(),field, valueToAdd);
    }

    public static Date addToDate(Date date, int field, int valueToAdd)
    {
        calendar.setTime(date);
        calendar.add(field, valueToAdd);
        return calendar.getTime();
    }


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
        String dateInMyFormat = null;
        try
        {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            dateInMyFormat = simpleDateFormat.format(date);
            return dateInMyFormat;
        }
        catch(Exception e)
        {
            System.out.println("Request format" + format + "is illegal");
            throw e;
        }
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
    // Method of adding value to the current hour value

    public static Date addHoursToNow(int hoursToAdd)
    {
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();
    }

    //-------------------------------------------------------------
    // Method of adding value to the current minutes value

    public static Date addMinuteToNow(int minutesToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, minutesToAdd);
        return calendar.getTime();
    }

    // Method of adding value to the current day value

    public static Date addDayToNow(int daysToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
        return calendar.getTime();
    }



    public static Date addDaysToDate(Date date, int valueToAdd)
    {
        return addToDate(Calendar.DAY_OF_YEAR,2);
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
