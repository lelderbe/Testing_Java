package swing_test.chapter2_events.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 06.09.2016.
 */
public class InnerClassEvents extends JFrame {

    private JTextField text;
    private JButton button;

    public InnerClassEvents() {
        super("Inner class events");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(text = new JTextField(10));
        getContentPane().add(button = new JButton("Click me"));
        button.addActionListener(new ButtonL());


        pack();

//        setSize(300, 300);
        setLocationRelativeTo(null);





        setVisible(true);
    }

    class ButtonL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(text.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassEvents();
    }

}
