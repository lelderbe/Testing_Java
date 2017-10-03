package strings;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 14.04.2017.
 */
public class RegexpTest {

    public void test() {
        System.out.println("From test()");
    }

    public static void main(String[] args) throws IOException {




/*
        // 9	Как преобразовать число в 16-тиричную строку (123->»7B»)?
        System.out.println(Integer.toHexString(123));
        // 10	Как преобразовать число в двоичную строку (123->»1111011″)?
        System.out.println(Integer.toBinaryString(123));
*/


/*
        // 7	Как узнать максимальное значение int?
        System.out.println(Integer.MAX_VALUE);
        // 8	Как узнать минимальное значение byte?
        System.out.println(Byte.MIN_VALUE);
*/

/*
        // 4	Как определить, содержит ли переданный объект определенный метод?
        Method methodToFind = null;
        try {
//            methodToFind = Object.class.getMethod("equals", (Class<?>[]) null);
            methodToFind = RegexpTest.class.getMethod("test", (Class<?>[]) null);
        } catch (NoSuchMethodException | SecurityException e) {
            // Your exception handling goes here
        }
        System.out.println(methodToFind);
*/


/*
        // 2	Как отсортировать список строк в обратном алфавитном порядке?
        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[] {"Eliza", "Samson", "Hector", "Lucky"}));

        //1
        Collections.sort(list);
        Collections.reverse(list);

        //2
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
*/


/*
        // 1	Как отсортировать массив чисел?
        int[] array3 = new int[] {4, 1, -3, 0, 5, 2};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
*/


/*
        System.out.println("abc".matches("[a-z]+"));
        System.out.println("abc".matches(".*"));
        System.out.println("C:\\anything".matches("C:\\\\.*"));
*/


/*
        // 5	Как развернуть строку задом наперед?
        System.out.println(new StringBuilder("123").reverse().toString());
*/

/*
        // 6	Как узнать имя текущей кодировки?
        System.out.println(Charset.defaultCharset());
*/

/*
        // 7	Как создать папку на диске?
        File file = new File("C:/TEMP/1/folder123");
        file.mkdir();
*/

/*
        // 8	Как проверить – Есть ли определенная папка на диске?
        File file = new File("C:/TEMP/1/folder123");
        System.out.println(file.exists());
*/

/*
        // 9	Как скопировать файл?
        FileInputStream file1 = new FileInputStream("C:/TEMP/1/f1.txt");
        FileOutputStream file2 = new FileOutputStream("C:/TEMP/1/f33.txt");

        while (file1.available() > 0) {
            int b = file1.read();
            file2.write(b);
        }

        file1.close();
        file2.close();
*/

        // 10	Как скопировать директорию?

/*
        // 5	Как преобразовать строку в кодировку Windows-1251?
        String utf8 = "Привет, мир!\n";
        System.out.print(utf8);

        byte[] bytes1251 = utf8.getBytes("Windows-1251");
        String win1251 = new String(bytes1251,"Windows-1251");
        System.out.print(win1251);

        PrintWriter file3 = new PrintWriter("C:/TEMP/1/win_file.txt", "Windows-1251");
        file3.write(win1251);
        file3.flush();
        file3.close();
*/


/*
        // 6	Как разбить строку на отдельные слова?
        System.out.println(Arrays.toString("Hello big big world".split(" ")));
        // StringTokenizer?
*/




    }
}
