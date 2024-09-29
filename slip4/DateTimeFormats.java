import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormats {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Current date is : " + sdf1.format(currentDate));
        System.out.println("Current date is : " + sdf2.format(currentDate));
        System.out.println("Current date is : " + sdf3.format(currentDate));
        System.out.println("Current date and time is : " + sdf4.format(currentDate));
        System.out.println("Current date and time is : " + sdf5.format(currentDate));
        System.out.println("Current time is : " + sdf6.format(currentDate));

        Calendar calendar = Calendar.getInstance();
        System.out.println("Current week of year is : " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Current week of month : " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current day of the year is : " + calendar.get(Calendar.DAY_OF_YEAR));
    }
}
