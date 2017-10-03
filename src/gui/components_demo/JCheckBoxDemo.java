package gui.components_demo;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by user on 02.11.2016.
 */
public class JCheckBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        final JCheckBox check = new JCheckBox("Goes to 11");
        check.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String onOrOff = "off";
                if (check.isSelected()) {
                    onOrOff = "on";
                }
                System.out.println("Check box is " + onOrOff);
            }
        });

        JPanel panel = new JPanel();

        panel.add(check);

        check.setSelected(true);


        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
}
