package swing_test.chapter2_events.customcomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by user on 07.09.2016.
 */
public class SimpleButton extends JComponent {

    private ArrayList listeners = new ArrayList();
    ButtonPressEvent event = new ButtonPressEvent(this);

    public SimpleButton() {
        addMouseListener(new PressL());
        setPreferredSize(new Dimension(100, 100));
    }

    public void addButtonPressListener(ButtonPressListener l) {
        listeners.add(l);
    }

    public void removebuttonPressListener(ButtonPressListener l) {
        listeners.remove(l);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.draw3DRect(0, 0, getWidth(), getHeight(), true);
    }

    protected void fireButtonPressed() {
        Iterator i = listeners.iterator();
        while (i.hasNext()) {
            ((ButtonPressListener) i.next()).buttonPressed(event);
        }
    }

    class PressL extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            fireButtonPressed();
        }
    }
}
