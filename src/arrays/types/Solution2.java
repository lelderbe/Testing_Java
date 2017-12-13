package arrays.types;

import java.util.ArrayList;

public class Solution2 {
    public static void main(String[] args) {
        // ArrayStoreException example
        Number[] array = new Integer[3];

        array[0] = new Integer(1);
//        array[1] = new Double(3.14);    // ArrayStoreException

        for (Number element : array) {
            System.out.println(element);
        }

//        ArrayList<Number> list = new ArrayList<Integer>();

    }
}
