package exceptions.loop;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 13.05.2017.
 */
public class Solution {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");

        for (String string : set) {
//        while (true) {

            System.out.println(string);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try {

                throw new Exception("test");
            } catch (Exception e) {
                System.out.println("catch");
            }

        }
    }
}
