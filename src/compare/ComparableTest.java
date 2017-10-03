package compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 27.04.2017.
 */
public class ComparableTest {
    public static void main(String[] args) {
        ArrayList<Man> list = new ArrayList<>();

        list.add(new Man(5));
        list.add(new Man(33));
        list.add(new Man(15));

        Collections.sort(list);
        System.out.println(list);
    }

    static class Man implements Comparable<Man> {
        private int age;

        public Man(int age) {
            this.age = age;
        }


        @Override
        public int compareTo(Man o) {
            return age - o.age;
        }

        @Override
        public String toString() {
            return "Man age: " + age;
        }
    }

}
