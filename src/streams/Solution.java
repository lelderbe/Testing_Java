package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by user on 06.10.2016.
 */
public class Solution {

    public static void main(String[]args) throws IOException {
        InputStream is = new FileInputStream("C:\\TEMP\\file.txt");

        while (is.available() > 0) {
            System.out.print((char)is.read());
        }

    }

}
