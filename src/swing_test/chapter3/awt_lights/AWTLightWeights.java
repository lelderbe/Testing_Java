package swing_test.chapter3.awt_lights;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 08.09.2016.
 */
public class AWTLightWeights extends Frame {
    public AWTLightWeights() {
        super("AWTLightWeights");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Lightweight1 lt1 = new Lightweight1();
        Lightweight2 lt2 = new Lightweight2();
        setLayout(null);
        lt1.setBounds(0, 0, 200, 200);
        lt2.setBounds(0, 0, 200, 200);
        add(lt2);
        add(lt1);

        Button button = new Button("Heavy!");
        button.setBounds(50, 50, 180, 30);
        add(button);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class Lightweight1 extends Component {
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.fillRect(20, 40, 100, 100);
        }
    }

    class Lightweight2 extends Component {
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.red);
            g.fillOval(20, 30, 90, 90);
        }
    }

    public static void main(String[] args) {
        new AWTLightWeights();
    }
}
