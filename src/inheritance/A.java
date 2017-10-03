package inheritance;

/**
 * Created by user on 26.09.2016.
 */
public class A {

    private String text = "Text";

    public String getText() {
        System.out.println(this.getClass());
        return this.text;
    }

    public A() {
    }

    public A(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getText());

        B b = new B();
        System.out.println(b.getText());

//        System.out.println(b.);

    }
}
