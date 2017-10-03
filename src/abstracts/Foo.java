package abstracts;

/**
 * Created by user on 11.05.2016.
 */
public class Foo {
    public static int foo(int[] array, int num){
        int i = array.length - 1;
        int count = 0;
        while (i >= 0){
            if (array[i] > num){
                return i;
            }
            i--;
            count++;
        }
        return i;
    }
    public static void main(String[] args){
        int[] array = {-4, 6, 1, 0, -1};
        System.out.println(foo(array, 7));
    }
}