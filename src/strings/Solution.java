package strings;

/**
 * Created by user on 12.04.2017.
 */
public class Solution {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = str1.substring(1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
    }
}
