import java.text.NumberFormat;

/**
 * Created by user on 01.06.2016.
 */
public class TestNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.exit(0);

        // Преобразование из строки в число
        System.out.println(Byte.parseByte("0101"));

        // Различные системы счисления
        System.out.println(Byte.parseByte("0101", 2));
        System.out.println(Short.parseShort("FF", 16));

        // Произвольные системы счисления (от 2 до 36)
        System.out.println(Byte.valueOf("0101", 3).byteValue());
        System.out.println(Byte.valueOf("0101", 2));

        System.out.println(Long.decode("255").floatValue());

        // Форматирование чисел - NumberFormat
        System.out.println((NumberFormat.getCurrencyInstance()).format(1234.56));


    }
}
