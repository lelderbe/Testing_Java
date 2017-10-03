package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 06.06.2016.
 */
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("action performed!");
        System.out.println(e.paramString());
    }

    /**
     *
     */
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me!!!");

        button.addActionListener(this);

        frame.getContentPane().add(button);

        frame.getContentPane().add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.cyan);
                g.fillRect(20, 50, 100, 100);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
