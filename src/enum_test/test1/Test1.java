package enum_test.test1;

/**
 * Created by user on 20.04.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        for (Enum1 enum1 : Enum1.values()) {
            System.out.println(enum1.getFullname());
        }
    }
}
