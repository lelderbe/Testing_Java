package access;

/**
 * Created by user on 10.01.2017.
 */
public class PrivateTest {

    private int a = 5;

    public static void main(String[] args) {
        PrivateTest privateTest = new PrivateTest();
        privateTest.a = 15;

        PrivateTest privateTest2 = new PrivateTest();
        privateTest2.a = 17;

        privateTest.meth(privateTest2);

        System.out.println(privateTest2.a);

        PrivateTest.meth2(privateTest2);

        System.out.println(privateTest2.a);

    }

    public void meth(PrivateTest other) {
        other.a = 99;
    }


    public static void meth2(PrivateTest other) {
        other.a = 199;
    }
}
