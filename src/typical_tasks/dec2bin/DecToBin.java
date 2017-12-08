package typical_tasks.dec2bin;

/**
 * Convert decimal number to binary
 */
public class DecToBin {

    /**
     * Алгоритм: делим число на 2, пока результат не будет меньше 2х.
     * После чего выводим в обратном порядке остатки от деления.
     * @param value - десятичное число
     * @return строковое представление двоичного числа
     */
    public String convert(int value) {
        StringBuilder result = new StringBuilder();

        if (value >= 2) {
            result.append(convert(value / 2));
        }

        result.append(value % 2);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DecToBin().convert(64));
    }
}
