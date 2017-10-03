package types;

/**
 * Created by user on 17.02.2017.
 */
public class Wrappers {
    public static void main(String[] args) {
        Integer a = 127; //new Integer(127);
        Integer b = 127; //new Integer(127);

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
    }
}
