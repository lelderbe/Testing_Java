package hello_world.v4;

import javax.swing.*;

/**
 * Created by user on 20.10.2016.
 */
public class HelloJava4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent4("Hello, Java!"));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
