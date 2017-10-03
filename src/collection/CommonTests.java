package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 27.02.2017.
 */
public class CommonTests {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        System.out.println(list);

        list = Collections.EMPTY_LIST;
        System.out.println(list);


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // rotate() test
        Collections.rotate(list, 1);

        // shuffle() test
        Collections.shuffle(list);

        System.out.println(list);

        //emptyList() test
//        list = Collections.emptyList();
//        System.out.println(list);
//
//        list.add("string");
//
//        System.out.println(list);
    }
}
