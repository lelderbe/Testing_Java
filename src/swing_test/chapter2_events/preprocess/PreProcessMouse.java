package swing_test.chapter2_events.preprocess;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by user on 07.09.2016.
 */
public class PreProcessMouse extends JFrame {
    public PreProcessMouse() {
        super("PreProcessMouse");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(new MouseL());
        setSize(200, 200);
        setVisible(true);
    }

    @Override
    protected void processMouseEvent(MouseEvent e) {
        if (e.getClickCount() == 1) {
            return;
        } else {
            super.processMouseEvent(e);
        }
    }

    public static void main(String[] args) {
        new PreProcessMouse();
    }

    class MouseL extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("ClickCount: " + e.getClickCount());
        }
    }
}
