package swing_test.chapter2_events.firstevents;

import java.awt.event.KeyEvent;

/**
 * Created by user on 30.08.2016.
 */
public class KeyListener implements java.awt.event.KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e);
    }
}
