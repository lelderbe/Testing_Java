package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 02.10.2016.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

//        Iterator<String> iterator = list.iterator();
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // формирует список на основе массива. Массив при этом используется для внутреннего представления списка.
        // Таким образом сохраняется связь между списком и исходным массивом:
        String[] a = { "foo", "bar", "baz"};
        List<String> list2 = Arrays.asList(a);
        System.out.println(list2); // [foo, bar, baz]

        a[0] = "aaa";
        System.out.println(list2); // [aaa, bar, baz]

    }
}
