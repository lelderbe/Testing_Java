package typical_tasks.nod;

/**
 * Поиск наибольшего общего делителя
 */
public class NodMaxCalculate {

    /**
     * Алгоритм: В самом простом случае алгоритм Евклида применяется к паре положительных целых чисел
     * и формирует новую пару, которая состоит из меньшего числа и разницы между большим и меньшим числом.
     * Процесс повторяется, пока числа не станут равными.
     * Найденное число и есть наибольший общий делитель исходной пары.
     * @param a
     * @param b
     * @return
     */
    public int calcRecursion(int a, int b) {
        int result = 1;

        if (a != b) {
            int diff = Math.abs(a - b);
            if (a < b) {
                result = calcRecursion(a, diff);
            } else {
                result = calcRecursion(b, diff);
            }
        } else {
            return a;
        }

        return result;
    }

    /**
     * Решение через цикл проще и застраховано от переполнения стека.
     * @param a
     * @param b
     * @return
     */
    public int calcIterate(int a, int b) {
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }

        return a;
    }

    public static void main(String[] args) {
//        System.out.println(new NodMaxCalculate().calcRecursion(123232, 8));
        System.out.println(new NodMaxCalculate().calcIterate(123232, 8));
    }
}
