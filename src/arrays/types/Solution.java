package arrays.types;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Number[] array = new Number[3];

        array[0] = new Integer(1);
        array[1] = new Double(3.14);

        for (Number number : array) {
            System.out.println(number);
        }

        ArrayList<Number> list = new ArrayList<>();

        list.add(new Integer(1));
        list.add(new Double(3.14));
//        list.add(new Object());

        for (Number element : list) {
            System.out.println(element);
        }




    }
}
