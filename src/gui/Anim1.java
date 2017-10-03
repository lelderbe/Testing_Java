package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.11.2016.
 */
public class Anim1 {
    int x = 50;
    int y = 50;

    public static void main(String[] args) throws InterruptedException {
        Anim1 anim = new Anim1();
        anim.go();
    }

    public void go() throws InterruptedException {
        JFrame frame = new JFrame("Animation test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyPanel();
        frame.getContentPane().add(panel);


        frame.setVisible(true);

        Thread.sleep(500);


        for (int i = 0; i < 200; i++) {
            x += 1;
            y += 1;
            panel.repaint();
            Thread.sleep(20);
        }

    }


    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.blue);
            g.fillOval(x, y, 50, 50);
        }
    }
}
