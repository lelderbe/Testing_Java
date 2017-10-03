import org.omg.CORBA.Environment;

/**
 * Created by user on 19.05.2016.
 */
public class Inheritance {
    public static void main(String[] args) {

        Abstr.dosmth();

        FinClass f = new FinClass();
        System.out.println(f.a);

        B b1 = new B();
        System.exit(0);


        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a.getIvar());
        System.out.println(b.getIvar());

        System.exit(0);

        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();

        System.out.println();

        c.m1();
        c.m2();
        c.m3();

        System.out.println();
        a.m1();
        b.m2();
        c.m3();
        System.out.println();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}

abstract class Abstr {
    int var = 10;

    public static void dosmth() {
        System.out.println("static method of abstract class");
    }
}

class FinClass {
    public final int a;

    public FinClass() {
        a = 111;
    }
}

class A {
    int ivar = 7;

    int getIvar() {
        return ivar;
    }

    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }

    public A() {
        System.out.println("A()");

    }

    public A(int ivar) {
        this.ivar = ivar;
        System.out.println("A(int ivar)");
    }
}

class B extends A {
    int bvar;

    void m1() {
        System.out.print("B's m1, ");
    }

    public B() {
        this(5);
        System.out.println("B()");
    }

    public B(int bvar) {
        super(3);
        this.bvar = bvar;
        System.out.println("B(int bvar)");
    }

}

class C extends B {
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}

