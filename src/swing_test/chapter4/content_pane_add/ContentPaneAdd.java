package swing_test.chapter4.content_pane_add;

import javax.swing.*;

/**
 * Created by user on 11.09.2016.
 */
public class ContentPaneAdd extends JFrame {
    public ContentPaneAdd() {
        super("ContentPaneAdd");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JButton("button1"));
        panel.add(new JButton("button2"));
        setContentPane(panel);

        setSize(200, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneAdd();
    }
}
