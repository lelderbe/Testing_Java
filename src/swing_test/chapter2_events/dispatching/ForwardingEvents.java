package swing_test.chapter2_events.dispatching;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 06.09.2016.
 */
public class ForwardingEvents extends JFrame {

    JButton button1, button2;

    public ForwardingEvents() {
        super("ForwardingEvents");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        button1 = new JButton("OK");
        button2 = new JButton("Cancel");
        getContentPane().add(button1);
        getContentPane().add(button2);

        Forwarder forwarder = new Forwarder();
        button1.addActionListener(forwarder);
        button2.addActionListener(forwarder);

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ForwardingEvents();
    }

    class Forwarder implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                onOK(e);
            }
            if (e.getSource() == button2) {
                onCancel(e);
            }
        }

        public void onOK(ActionEvent e) {
            System.out.println("onOK");
        }

        public void onCancel(ActionEvent e) {
            System.out.println("onCancel");
        }

    }
}
