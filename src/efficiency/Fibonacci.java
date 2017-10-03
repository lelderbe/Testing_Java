package efficiency;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 12.05.2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        double t1;

        int[] arr = new int[] {2, 3, 4, 1, 9};

        System.out.println(Arrays.toString(arr));


        System.exit(0);

//        n1 = System.nanoTime();
        t1 = System.currentTimeMillis();
        System.out.println("\n" + fib1(15));
//        System.out.println(System.currentTimeMillis() - t1);
        System.out.format("%-25s %20s\n", "fib1, Time elapsed: ", (System.currentTimeMillis() - t1) + " ms");

        t1 = System.currentTimeMillis();
        System.out.println("\n" + fib2(15));
//        System.out.println();
//        System.out.format("%-25s %20d\n", "fib2, Result: ", fib2(15));
        System.out.format("%-25s %20s\n", "fib2, Time elapsed: ", (System.currentTimeMillis() - t1) + " ms");
//        System.out.println(System.currentTimeMillis() - t1);

        rec2(0);
    }

    public static long fib2(int n) {
        System.out.print("2");
        return fi(n, 0, 1);
    }

    public static long fi(int n, long x, long y) {
        System.out.print("2");
        if (n == 0) return 0;
        if (n == 1) return y;
        return fi(n - 1, y, x + y);
    }

    public static long fib1(int n) {
        System.out.print("1");
        if (n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void rec2(int n) {
        System.out.print(n);
        if (n < 3) {
            rec2(n + 1);
        }
        System.out.print(n);
    }

}
