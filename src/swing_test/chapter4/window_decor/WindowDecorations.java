package swing_test.chapter4.window_decor;

import javax.swing.*;

/**
 * Created by user on 13.09.2016.
 */
public class WindowDecorations {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Окно с рамкой");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JDialog dialog = new JDialog(frame, "Диалог");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(150, 100);
        dialog.setLocationRelativeTo(frame);
        dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        dialog.setVisible(true);
    }
}
