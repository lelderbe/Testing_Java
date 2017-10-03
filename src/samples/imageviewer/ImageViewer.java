package samples.imageviewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 29.11.2016.
 */
public class ImageViewer {
    public static void main(String[] args) {
        new ImageViewerFrame();
    }
}

class ImageViewerFrame extends JFrame {
    private final static int DEFAULT_WIDTH = 600;
    private final static int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Image Viewer");

        JLabel label = new JLabel();
        getContentPane().add(label);

        // Страдашки с меню
//        JMenuBar menuBar = new JMenuBar();              // Панель меню
//        JMenu menuFile = new JMenu();                   // Меню File
//        menuFile.setText("Game");
//        JMenuItem menuFileItemNew = new JMenuItem();
//        JMenuItem menuFileItemExit = new JMenuItem();
//        menuFileItemNew.setText("New game");
//        menuFileItemExit.setText("Exit");
//        menuFileItemNew.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                newGame = true;
//            }
//        });
//        menuFileItemExit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        menuFile.add(menuFileItemNew);
//        menuFile.add(menuFileItemExit);
//        menuBar.add(menuFile);
//        setJMenuBar(menuBar);
        // Конец создания меню

        JMenuBar menuBar = new JMenuBar();              // Панель меню
        JMenu menuFile = new JMenu("File");
        JMenuItem menuOpen = new JMenuItem("Open");
        JMenuItem menuExit = new JMenuItem("Exit");

        menuFile.add(menuOpen);
        menuFile.add(menuExit);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);

        menuExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}
