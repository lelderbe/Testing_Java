package strings.format;

/**
 * Created by user on 29.04.2017.
 */
public class FormatTest {
    public static void main(String[] args) {


        String string = "date_bot_" + String.format("%02d", (int) (Math.random() * 99));

        System.out.println(string);
    }
}
