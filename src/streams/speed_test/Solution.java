package streams.speed_test;

import java.io.*;

/**
 * Created by user on 18.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        // Размер буфера - i
        for (int i = 1; i <= 64 * 1024; i = i * 2) {
            InputStream in = new BufferedInputStream(new FileInputStream("C:/TEMP/1/picture1.png"), i);
            OutputStream out = new BufferedOutputStream(new FileOutputStream("C:/TEMP/1/picture2.png"), i);

//            InputStream in = new FileInputStream("C:/TEMP/1/picture1.png");
//            OutputStream out = new FileOutputStream("C:/TEMP/1/picture2.png");

            long startTime = System.currentTimeMillis();
//            copy(in, out, i);
            copy1(in, out);
            long stopTime = System.currentTimeMillis();
            System.out.println(i + ": " + (stopTime - startTime));
            in.close();
            out.close();
        }

    }

    public static void copy(InputStream in, OutputStream out, int size) throws IOException {
        byte[] buff = new byte[size];
        int count;

//        while (in.available() > 0) {
        while ((count = in.read(buff)) > 0) {
//            count = in.read(buff);
            out.write(buff, 0, count);
        }
    }

    public static void copy1(InputStream in, OutputStream out) throws IOException {
        int data;
//        while (in.available() > 0) {
        while ((data = in.read()) != -1) {
//            data = in.read();
            out.write(data);
        }
    }

}
