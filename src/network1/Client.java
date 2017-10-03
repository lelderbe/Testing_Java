package network1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by user on 03.04.2017.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        try {
            Socket s = new Socket("localhost", 3456);
            System.out.println("Connected");
            Thread.sleep(5000);
            InputStream is = s.getInputStream();
            System.out.println("Read: "+is.read());
            s.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
