package arrays.types;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(new Integer(1));

        method(list);

    }

    public static void method(List<? extends Number> list) {
//    public static void method(List<Number> list) {
        for (Number element : list) {
            System.out.println(element);
        }
    }
}
