package hello_world.v1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 18.10.2016.
 */
public class HelloComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.drawString("Hello, Java!", 125, 95);
    }
}
