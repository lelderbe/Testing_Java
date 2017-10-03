package swing_test.chapter2_events.factory;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by user on 06.09.2016.
 */
public class FactoryEvents extends JFrame {
    private ListenerFactory factory = new ListenerFactory();

    public FactoryEvents() {
        super("FactoryEvents");
        addWindowListener(factory.getWindowL());
        JButton button = new JButton("Click me");
        getContentPane().add(button);
        button.addActionListener(factory.getButtonL());
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FactoryEvents();
    }

    class ListenerFactory {
        public ActionListener getButtonL() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ButtonListener");
                }
            };
        }

        public WindowListener getWindowL() {
            return new WindowL();
        }

        class WindowL extends WindowAdapter {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }

    }
}
