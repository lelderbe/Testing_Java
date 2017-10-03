package inheritance.private_member;

/**
 * Created by user on 25.04.2017.
 */
public class Solution {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getX());

        B b = new B();
        System.out.println(b.getX());

    }
}
