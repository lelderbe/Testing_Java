package hello_world.v2;

import javax.swing.*;

/**
 * Created by user on 19.10.2016.
 */
public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent2("Hello, Java!"));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
