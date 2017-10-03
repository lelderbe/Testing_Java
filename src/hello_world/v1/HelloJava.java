package hello_world.v1;

import javax.swing.*;

/**
 * Created by user on 18.10.2016.
 */
public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
//        frame.add(new JLabel("Hello, Java!", JLabel.CENTER));
        frame.add(new HelloComponent());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
