package testing;

/**
 * Created by user on 07.03.2016.
 */
public class VariableLengthArgs {

    public static void print(int a, int... args) {
        System.out.println("a=" + a);
        for (int x : args) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(2, 3, -10, 7, 4);
        print(0, 0, 1);
        print(1, new int[]{7, -7, 7, -7, 7});

        AnotherClass ac = new AnotherClass();
        System.out.println(ac.i);

    }
}

class AnotherClass {
    int i = 10;
}
