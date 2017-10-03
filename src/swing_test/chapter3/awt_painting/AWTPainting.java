package swing_test.chapter3.awt_painting;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 08.09.2016.
 */
public class AWTPainting extends Frame {
    public AWTPainting() {
        super("AWTPainting");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 50, 200, 100);
    }

    public static void main(String[] args) {
        new AWTPainting();
    }

}
