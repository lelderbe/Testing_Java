import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 02.06.2016.
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());

        System.out.println((DateFormat.getDateInstance().format(new Date())));
        System.out.println((DateFormat.getDateInstance(DateFormat.SHORT).format(new Date())));
        System.out.println((DateFormat.getDateInstance(DateFormat.FULL).format(new Date())));

        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        System.out.println((new SimpleDateFormat("dd/MM/yyyy")).parse("01/10/1977"));

        System.out.println("-----------");

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        cal.set(1977, Calendar.OCTOBER, 1);
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
