package inheritance.create_order;

/**
 * Created by user on 05.03.2017.
 */
public class B extends A {

    static int fieldB = 15;

    {
        System.out.println("[Object] Class B init section pre-C -- " + fieldB);
    }

    private static C classC = new C();


    static {
        System.out.println("[Class] Class B static init section");
    }




    public B() {
        System.out.println("[Object] Class B constructor");
    }

    {
        System.out.println("[Object] Class B init section post-C");
    }




}
