package inheritance.create_order;

/**
 * Created by user on 05.03.2017.
 */
public class C {
    private String name;

    static int fieldC = 1;

    static {
        System.out.println("[Class] Class C static init section -- " + fieldC);
    }



    {
        System.out.println("[Object] Class C init section");
    }

    public C() {
        this("ClassC");
        System.out.println("[Object] Class C constructor");
    }

    public C(String name) {
        this.name = name;
        System.out.println("[Object] Class C(String) constructor");
    }
}
