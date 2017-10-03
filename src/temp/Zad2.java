package temp;

/**
 * Created by user on 22.01.2017.
 */
public class Zad2 {
    public static void main(String[] args) {
        int n = 14;
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * (1 + 1.0 / (i * i));
        }

        System.out.println(result);

    }
}
