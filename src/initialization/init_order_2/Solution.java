package initialization.init_order_2;

/**
 * Created by user on 06.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new A());
    }

    public static class SuperA {
        static {
            System.out.println("SuperA: static init");
        }

        public SuperA() {
            System.out.println("SuperA: constructor");
        }

        {
            System.out.println("SuperA: init");
        }
    }

    public static class A extends SuperA {
        private int a;
        private int b;

//        {
//            System.out.println(this.toString());
//        }

        static {
            System.out.println("A: static init");
        }


        public A() {
//            System.out.println(this.toString());
            System.out.println("A: constructor");
            b = a;
            a = 78;
        }

        public A(int a) {
            System.out.println("A: constructor(int)");
            b = this.a;
            this.a = a;
        }

        {
//            System.out.println(this.toString());
            System.out.println("A: init");
            a = 15;
        }

        private B class_b = new B();

        @Override
        public String toString() {
            return "a = " + a + ", b = " + b;
        }
    }

    public static class B {
        static {
            System.out.println("B: static init");
        }

        {
            System.out.println("B: init");
        }

        public B() {
            System.out.println("B: constructor");
        }
    }


}
