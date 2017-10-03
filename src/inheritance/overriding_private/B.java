package inheritance.overriding_private;

/**
 * Created by user on 08.10.2016.
 */
public class B extends A {
    public void method1() {
        System.out.println("B public method 1");
    }

    @Override
    public void method2() {
        System.out.println("B public method 2");
    }

    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method1();
        b.method2();
    }
}
