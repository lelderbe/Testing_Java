package hello_world.v3;

import javax.swing.*;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by user on 19.10.2016.
 */
public class HelloJava3 {
    public static void main(String[] args) {


        System.out.println(Date.valueOf("1950-12-31"));

        System.out.println("Hello".getBytes());
        System.out.println(Arrays.toString("Hello".getBytes()));

        String str = "0501234567";

        System.out.println("+" + "58" + "(" + str.substring(0, 3) + ")" + str.substring(3, 6) + "-" + str.substring(6, 8) + "-" + str.substring(8, 10));

        System.exit(0);

        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent3("Hello, Java!"));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
