package gui.components_demo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Created by user on 02.11.2016.
 */
public class JListDemo {

    static JList list;
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);

        JScrollPane scroller = new JScrollPane(list);

        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel panel = new JPanel();

        panel.add(scroller);

        list.setVisibleRowCount(4);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selection = (String) list.getSelectedValue();
                    System.out.println(selection);
                }
            }
        });


        frame.getContentPane().add(panel);
        frame.setVisible(true);


    }
}
