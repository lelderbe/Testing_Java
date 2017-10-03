package gui;

import javax.swing.*;

/**
 * Created by user on 24.05.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
