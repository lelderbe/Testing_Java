package quizful.quiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 29.09.2016.
 *
 * Что будет выведено на консоль в результате компиляции и выполнения следующего класса:
 (предполагается, что все необходимые import'ы имеются)
 public class A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = null;
        list.toArray(array);
        System.out.println(list.get(1));
    }
 }
 *
 *
 */
public class A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        Integer[] array = new Integer[1];
        int[] arr = {1, 3, 4};

        System.out.println(Arrays.toString(arr));

        System.out.println(list);

        System.out.println(Arrays.toString(list.toArray(array)));

        System.out.println(Arrays.toString(array));

        System.out.println(list.get(1));
    }
}