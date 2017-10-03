package date_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by user on 30.10.2016.
 */
public class CalendarTest {
    public static void main(String... args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println(" >> " + simpleDateFormat.format(calendar.getTime()));



        System.out.println(calendar.getTimeInMillis());
        System.out.println(System.currentTimeMillis());

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
