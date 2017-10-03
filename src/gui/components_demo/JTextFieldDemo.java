package gui.components_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 02.11.2016.
 */
public class JTextFieldDemo {
    public static JTextField field;
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        field = new JTextField(20);  // 20 столбцов
//        JTextField field = new JTextField("Your text here ...");
        JPanel panel = new JPanel();

        panel.add(new JLabel("Text field: "));
        panel.add(field);

        field.setText("Whatever...");

        System.out.println(field.getText());

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("*******************");
            }
        });

        field.selectAll();

        field.requestFocus();


        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }
}
