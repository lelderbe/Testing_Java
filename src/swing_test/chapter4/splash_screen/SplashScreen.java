package swing_test.chapter4.splash_screen;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11.09.2016.
 */
public class SplashScreen extends JWindow {

    private Image capture;
    private Image splash = getToolkit().getImage("C:\\TEMP\\image.gif");

    public SplashScreen() throws InterruptedException {
        super();
        setLocation(200, 100);
        setSize(300, 300);
        try {
            Robot robot = new Robot();
            capture = robot.createScreenCapture(new Rectangle(200, 100, 500, 400));
        } catch (Exception e) {
            e.printStackTrace();
        }
        getContentPane().add(new Splash());
        setVisible(true);

        Thread.sleep(10000);
        System.exit(0);
    }

    class Splash extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(capture, 0, 0, this);
            g.drawImage(splash, 0, 0, this);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new SplashScreen();
    }
}
