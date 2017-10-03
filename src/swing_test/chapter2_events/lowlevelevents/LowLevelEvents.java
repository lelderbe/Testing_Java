package swing_test.chapter2_events.lowlevelevents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by user on 31.08.2016.
 */
public class LowLevelEvents extends JFrame {
    private JTextArea out;

    public LowLevelEvents() throws HeadlessException {
        super("LowLevelEvents");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new JScrollPane(out = new JTextArea()));
        JButton button = new JButton("Источник событий");
        getContentPane().add(button, "South");

        OurListener ol = new OurListener();
        button.addKeyListener(ol);
        button.addMouseListener(ol);
        button.addMouseMotionListener(ol);
        button.addFocusListener(ol);


        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LowLevelEvents();
    }

    class OurListener implements MouseListener, KeyListener, MouseMotionListener, MouseWheelListener, FocusListener {

        @Override
        public void keyTyped(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void focusGained(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void focusLost(FocusEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            out.append(e.toString() + "\n");
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            out.append(e.toString() + "\n");
        }
    }
}
