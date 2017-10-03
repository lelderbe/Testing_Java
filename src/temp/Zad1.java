package temp;

/**
 * Created by user on 22.01.2017.
 */
public class Zad1 {
    public static void main(String[] args) {
        int a = 3;
        int n = 14;

        double result = 0;
        int k = 1;

        for (int i = 0; i <= n; i++) {
            k = k * (a + i);
            result = result + 1.0 / k;
        }

        System.out.println(result);

    }
}
