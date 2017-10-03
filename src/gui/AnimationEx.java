package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 08.06.2016.
 */
public class AnimationEx {
    int x = 70;
    int y = 70;

    JPanel panel;

    public static void main(String[] args) throws InterruptedException {
        AnimationEx gui = new AnimationEx();
        gui.go();
    }

    public void go() throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InnerPanel panel = new InnerPanel();

        frame.getContentPane().add(panel);


        frame.setSize(500, 500);
        frame.setVisible(true);

        for (int i = 0; i < 20; i++) {
            Thread.sleep(250);
            panel.repaint();
            x += 5;
            y += 5;
        }

    }

    class InnerPanel extends JPanel {
//        int x = 70;
//        int y = 70;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.cyan);
            g.fillOval(x, y, 100, 100);
        }
    }
}
