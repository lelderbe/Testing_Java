package inheritance.abstract_class;

/**
 * Created by user on 07.03.2017.
 */
public abstract class A {

    public int a = 5;

    static {
        System.out.println("[Class] Class A static init");
    }

    {
        System.out.println("[Object] Class A init");
    }

    public A() {
        System.out.println("[Object] Class A Constructor");
    }

    public abstract void method();
}
