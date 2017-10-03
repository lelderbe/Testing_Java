package golovach;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 13.04.2016.
 */
public class ISOS {
    public static void main(String[] args) throws IOException {

        System.out.println(5 / 0);

        InputStream src = new URL("http://google.com/").openStream();
        OutputStream dst = new FileOutputStream("gg.html");
        copy(src, dst);
//        copy(src, System.out);

//        OutputStream dst = new FileOutputStream("gg2.html");
//        copy_buff(src, dst);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read();
            if (data == -1) {
                return;
            } else {
                dst.write(data);
            }
        }
    }

    public static void copy_buff(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[64 * 1024];
        while (true) {
            int count = src.read(buff);
            if (count == -1) {
                return;
            } else {
                dst.write(buff, 0, count);
            }
        }
    }

}
