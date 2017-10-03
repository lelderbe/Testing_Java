package gui.test1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.03.2017.
 */
public class Solution {
    private JFrame frame;


    public static void main(String[] args) {
        new Solution().makeGUI();
    }

    public void makeGUI() {
        String[] columnNames = {
                "Name",
                "Last modified",
                "Type",
                "Size"
        };

        String[][] data = {
                {"addins", "02.11.2006 19:15", "Folder", ""},
                {"AppPatch", "03.10.2006 14:10", "Folder", ""},
                {"assembly", "02.11.2006 14:20", "Folder", ""},
                {"Boot", "13.10.2007 10:46", "Folder", ""},
                {"Branding", "13.10.2007 12:10", "Folder", ""},
                {"Cursors", "23.09.2006 16:34", "Folder", ""},
                {"Debug", "07.12.2006 17:45", "Folder", ""},
                {"Fonts", "03.10.2006 14:08", "Folder", ""},
                {"Help", "08.11.2006 18:23", "Folder", ""},
                {"explorer.exe", "18.10.2006 14:13", "File", "2,93MB"},
                {"helppane.exe", "22.08.2006 11:39", "File", "4,58MB"},
                {"twunk.exe", "19.08.2007 10:37", "File", "1,08MB"},
                {"nsreg.exe", "07.08.2007 11:14", "File", "2,10MB"},
                {"avisp.exe", "17.12.2007 16:58", "File", "12,67MB"},
        };

        frame = new JFrame("Test");

//        frame.setSize(500, 320);
//        frame.setLocationRelativeTo(null);                    // Располагать в центре экрана
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(data, columnNames);

//        JPanel bg = new JPanel();
//        bg.setBackground(Color.orange);
//        frame.getContentPane().add(BorderLayout.CENTER, bg);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(1024, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
