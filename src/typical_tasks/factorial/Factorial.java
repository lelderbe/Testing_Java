package typical_tasks.factorial;

/**
 * Вычисление факториала числа
 */
public class Factorial {

    public long calcRecursion(int x) {
        if (x <= 1) {
            return 1;
        }

        return x * calcRecursion(--x);
    }

    public long calcIterable(int x) {
        long result = x--;
        for (int i = x; i > 1; i--) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().calcRecursion(5));
        System.out.println(new Factorial().calcIterable(5));
    }
}
