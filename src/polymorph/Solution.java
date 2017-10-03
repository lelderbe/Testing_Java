package polymorph;

/**
 * Created by user on 20.02.2017.
 */
public class Solution {


    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.a);
        Parent p = c;
        System.out.println(p.a);

        c.method1();
        p.method1();

    }


    static class Parent {
        int a = 2;

        public void method1() {
            System.out.println("Parent method1");
        }

    }

    static class Child extends Parent {
        int a = 3;

        public void method1() {
            System.out.println("Child method1");
        }

    }
}
