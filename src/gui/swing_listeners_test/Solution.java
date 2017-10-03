package gui.swing_listeners_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by user on 04.03.2017.
 */
public class Solution extends JPanel {
    private int lastX;
    private int lastY;
    private int ex;
    private int ey;

    private boolean clear = false;

    public Solution() {

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                ex = e.getX();
                ey = e.getY();
                repaint();
            }
        });



        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    clear = true;
                    repaint();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponents(g);

        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX = ex;
            lastY = ey;
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        frame.add(new Solution());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
