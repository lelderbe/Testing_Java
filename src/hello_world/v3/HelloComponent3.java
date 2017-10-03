package hello_world.v3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by user on 19.10.2016.
 */
public class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {
    JButton button;
    String text;
    int x = 125;
    int y = 95;

    int colorIndex = 0;
    static Color[] colors = {Color.black, Color.blue, Color.cyan, Color.green, Color.red, Color.pink, Color.orange};

    public HelloComponent3(String text) {
        this.text = text;
        button = new JButton("Change color");
        setLayout(new FlowLayout());
        add(button);
        button.addActionListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
//        setForeground(currentColor());
        g.setColor(currentColor());
        g.drawString(text, x, y);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            changeColor();
        }
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

    synchronized private void changeColor() {
        if (++colorIndex == colors.length) {
            colorIndex = 0;
        }
//        setForeground(currentColor());
        repaint();
    }

    synchronized private Color currentColor() {
        return colors[colorIndex];
    }
}
