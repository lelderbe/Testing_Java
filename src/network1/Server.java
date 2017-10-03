package network1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 03.04.2017.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3456);
            System.out.println("Waiting...");
            Socket client=ss.accept();
            System.out.println("Connected");
            client.getOutputStream().write(10);
            client.close();
            ss.close();
            System.out.println("Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
