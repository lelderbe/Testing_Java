package types;

/**
 * Created by user on 08.01.2017.
 */
public class DataLength {
    public static void main(String[] args) {
        float f1 = 1.0f / 3.0f;
        double f2 = 1.0d / 3.0d;
        System.out.printf("%5.2f\n", f1);
        System.out.printf("%.29f\n", f2);


        int a;
        a = 0;
        while (a <= 100)
        {
            System.out.printf("%4d degrees F = %4d degrees C\n", a, (a - 32) * 5 / 9);
            a = a + 10;
        }
    }
}
