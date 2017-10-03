package inheritance.create_order;

/**
 * Created by user on 05.03.2017.
 */
public class A {

    static {
        System.out.println("[Class] Class A static init section");
    }

    {
        System.out.println("[Object] Class A init section");
    }

    public A() {
        System.out.println("[Object] Class A constructor");
    }
}
