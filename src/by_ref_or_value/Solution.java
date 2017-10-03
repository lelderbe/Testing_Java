package by_ref_or_value;

/**
 * Created by user on 16.02.2017.
 */
public class Solution {

    String name;

    public Solution(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        Solution a = new Solution("A");
        Solution b = new Solution("B");

        System.out.println(a);
        System.out.println(b);

//        swap_names(a, b);
        wipe(a);

        System.out.println(a);
        System.out.println(b);

    }

    public static void wipe(Solution a) {
        System.out.println(a);
        a = null;
        System.out.println(a);
    }

    public static void swap(Solution a, Solution b) {
        Solution temp = a;
        a = b;
        b = temp;
    }

    public static void swap_names(Solution a, Solution b) {
        String temp = a.name;
        a.name = b.name;
        b.name = temp;
    }
}
