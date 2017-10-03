package inheritance.abstract_class;

/**
 * Created by user on 07.03.2017.
 */
public class B extends A {

    public int a = 3;

    static {
        System.out.println("[Class] Class B static init");
    }

    {
        System.out.println("[Object] Class B init");
    }

    public B() {
        super();
        System.out.println("[Object] Class B Constructor");
    }

    @Override
    public void method() {

    }
}
