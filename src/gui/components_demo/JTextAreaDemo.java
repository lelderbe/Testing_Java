package gui.components_demo;

import javax.swing.*;

/**
 * Created by user on 02.11.2016.
 */
public class JTextAreaDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        JTextArea text = new JTextArea(10, 20);  // 10 строк, 20 столбцов
        JScrollPane scroller = new JScrollPane(text);

        text.setLineWrap(true);

        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        JPanel panel = new JPanel();

        panel.add(new JLabel("Text area: "));
        panel.add(scroller);


        text.setText("Не все потерявшиеся - бродяги\n");
        text.append("Кнопка нажата");

        text.selectAll();

        text.requestFocus();




        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
}
