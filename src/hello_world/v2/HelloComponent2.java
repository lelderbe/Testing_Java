package hello_world.v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by user on 19.10.2016.
 */
public class HelloComponent2 extends JComponent implements MouseMotionListener {
    String text;
    int x = 125;
    int y = 95;

    public HelloComponent2(String text) {
        this.text = text;
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString(text, x, y);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
