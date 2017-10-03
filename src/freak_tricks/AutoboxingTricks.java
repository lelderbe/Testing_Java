package freak_tricks;

/**
 * Created by user on 17.05.2017.
 */
public class AutoboxingTricks {
    public static void main(String[] args) {

        Object o = true ? new Integer(1) : new Double(2.0);
        System.out.println(o); // выведет 1.0


//        Integer i = new Integer(1);
//        if (i.equals(1))
//            i = null;
//        Double d = new Double(2.0);
//        Object o = true ? i : d; // NullPointerException!
//        System.out.println(o);

    }
}
