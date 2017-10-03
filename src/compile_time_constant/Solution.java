package compile_time_constant;

/**
 * Created by user on 06.04.2017.
 */
public class Solution {
    public static final /*double*/ Double PI = 3.1415;
    public static final String TEXT = /*"Hello"*/ new String("Hello World");

    public static void main(String[] args) {
        System.out.println(TEXT + " / " + PI);

        ClassA classA = new ClassA();
        classA.sayPI();
    }
}
