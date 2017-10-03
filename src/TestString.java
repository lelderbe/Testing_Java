import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by user on 01.06.2016.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "login1;password1;01.10.1977;PC1;";
        String[] arr = s.split(";");
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------");

        StringBuffer sb = new StringBuffer("abc");
        sb.append(" def");
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        sb.setLength(3);
        System.out.println(sb);

        System.out.println("-----------");

        StringTokenizer st = new StringTokenizer(s, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
