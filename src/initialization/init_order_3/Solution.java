package initialization.init_order_3;

public class Solution extends Object {

    public static void main(String[] args) {
        new A();
    }

    public static class SuperA extends Object {
        // static init class block
        static {
            System.out.println("SuperA: static init class SuperA"); // 1
        }

        public SuperA() {
            System.out.println("SuperA: Constructor SuperA()");     // 4
        }

        int a = 2;

        // init object block
        {
            a = 3;
            System.out.println("SuperA: init object SuperA, a = " + a);   // 3
        }
    }

    public static class A extends SuperA {
        // static init class block
        static {
            System.out.println("A: static init class A");   // 2
        }

        public A() {
            System.out.println("A: Constructor A()");       // 6
        }

        // init object block
        {
            System.out.println("A: init object A");     // 5
        }
    }
}
