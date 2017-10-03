import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 13.03.2016.
 */
public class TemperatureConverter {


    /**
     *
     * @param temperature значение температуры
     * @param convertTo конвертировать в C или F
     * @return возвращает результат конвертации
     */
    public static String convertTemp(int temperature, char convertTo) {
        double result = convertTo == 'C'? (temperature - 32) * 5 / 9.0 : temperature * 9 / 5.0 + 32;
        return "" + result;
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(convertTemp(0, 'F'));
        System.out.println(convertTemp(1, 'F'));
        System.out.println(convertTemp(100, 'F'));
        System.out.println(convertTemp(100, 'C'));
        System.out.println(Integer.valueOf('a'));

        System.out.println(Runtime.getRuntime().availableProcessors());

    }

}
