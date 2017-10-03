package initialization;

import initialization.B;

/**
 * Created by user on 26.09.2016.
 */
public class A {

    {
        System.out.println("Initializer A - 1");
    }

    public A() {
        System.out.println("Constructor A()");
    }

    public A(int i) {
        this();
        System.out.println("Constructor A(int i)");
    }

    private String text = "Text";

    {
        System.out.println("Initializer A - 2");
    }


    public String getText() {
        System.out.println(this.getClass());
        return text;
    }

    public static void main(String[] args) {
//        A a = new A();
//        A a = new A(3);
//        System.out.println(a.getText());

        B b = new B(2);
//        System.out.println(b.getText());

//        System.out.println(b.);

    }
}
