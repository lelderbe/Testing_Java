package kata;

/**
 * Created by user on 23.01.2017.
 */
public class Factorial {

    public int factorial(int n) {

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        return n > 0 ?  n * factorial(n - 1) : 1;
    }


    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(13));
    }
}