import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 21.05.2016.
 */
public class StringFormat {
    public static void main(String[] args) {
        System.out.println(String.format("%,20d", 1000000000));
        System.out.println(String.format("%,.2f", 1000000000f));

        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));
        System.out.println(String.format("%tA, %<td %<tB %<tr", new Date()));

        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        System.out.println(c.getTime());
    }
}
