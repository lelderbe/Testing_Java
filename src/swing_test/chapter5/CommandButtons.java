package swing_test.chapter5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 18.09.2016.
 */
public class CommandButtons extends JFrame {
    public CommandButtons() {
        super("CommandButtons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 250);
        setLocation(150, 100);

        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 0));
        grid.add(new JButton("OK"));
        grid.add(new JButton("Cancel"));

        JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        flow.add(grid);

        Container c = getContentPane();
        c.add(flow, BorderLayout.SOUTH);

        setVisible(true);

    }

    public static void main(String[] args) {
        new CommandButtons();
    }
}
