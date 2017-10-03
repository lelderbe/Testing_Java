package initialization;

import initialization.A;

/**
 * Created by user on 26.09.2016.
 */
public class B extends A {

    private int x = 5;

    {
        x = 3;
        System.out.println("Initializer B - 1");
    }

    public B() {
        System.out.println("Constructor B()" + x);
    }

    public B(int i) {
//        this();
//        super(i);
        System.out.println("Constructor B(int i)");
    }

    private String text = "BBB text";

    {
        System.out.println("Initializer B - 2");
    }


}
