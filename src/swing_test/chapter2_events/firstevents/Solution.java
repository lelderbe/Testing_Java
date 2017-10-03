package swing_test.chapter2_events.firstevents;

import javax.swing.*;

/**
 * Created by user on 30.08.2016.
 */
public class Solution extends JFrame {
    public Solution() {
        super("First Events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addKeyListener(new KeyListener());

        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Solution();
    }
}
