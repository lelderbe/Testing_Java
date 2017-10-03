package streams.byte_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by user on 18.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fs = new FileInputStream("C:\\TEMP\\1\\out.txt");

        byte[] data = new byte[fs.available()];
        fs.read(data);

        System.out.println(Arrays.toString(data));
        fs.close();

        fs = new FileInputStream("C:\\TEMP\\1\\out.txt");
        while (fs.available() > 0) {
            System.out.print(fs.read() + ", ");
        }


//        FileOutputStream fo = new FileOutputStream("C:\\TEMP\\1\\out.txt");
//        byte[] data = new byte[]{-3, -5, 10, 17, -127, -128, 0, 127, 100, -100};
//
//        fo.write(data);



    }
}
