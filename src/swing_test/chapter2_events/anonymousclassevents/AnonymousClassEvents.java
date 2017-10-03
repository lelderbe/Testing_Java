package swing_test.chapter2_events.anonymousclassevents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 06.09.2016.
 */
public class AnonymousClassEvents extends JFrame {
    public AnonymousClassEvents() {
        super("AnonymousClassEvents");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JButton button = new JButton("Click me");
        getContentPane().add(button);
        button.addActionListener(getButtonL());

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public ActionListener getButtonL() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionListener");
            }
        };
    }


    public static void main(String[] args) {
        new AnonymousClassEvents();
    }
}
