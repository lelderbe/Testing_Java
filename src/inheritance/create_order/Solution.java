package inheritance.create_order;

/**
 * Created by user on 05.03.2017.
 */
public class Solution {

    public static int Solution_a = 12;

    static {
        System.out.println("[Class] Solution static init section -- " + Solution_a);
    }

    {
        System.out.println("[Object] Solution init section");
    }

    public Solution() {
        System.out.println("[Object] Solution constructor");
    }

    public static void main(String[] args) {
//        new Solution();
        A classA = new A();

        System.out.println();

        B classB = new B();



    }
}
