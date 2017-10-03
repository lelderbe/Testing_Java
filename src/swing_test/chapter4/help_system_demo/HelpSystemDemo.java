package swing_test.chapter4.help_system_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 * Created by user on 11.09.2016.
 */
public class HelpSystemDemo extends JFrame {

    private JButton btn1, btn2, btnHelp;
    private HelpSystem hs = new HelpSystem();
    private InterceptPane ip = new InterceptPane();
    private ImageIcon helpIcon = new ImageIcon("helpicon.gif");

    public HelpSystemDemo() {
        super("HelpSystemDemo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn1 = new JButton("Что-то делает");
        btn2 = new JButton("Тоже что-то делает");
        JPanel contents = new JPanel();
        contents.add(btn1);
        contents.add(btn2);
        btnHelp = new JButton(helpIcon);
        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // при нажатии получаем прозрачную панель
                ip.setVisible(true);
                getRootPane().setCursor(getToolkit().createCustomCursor(helpIcon.getImage(), new Point(0, 0), ""));
            }
        });
        contents.add(btnHelp);
        setContentPane(contents);
        setGlassPane(ip);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    class InterceptPane extends JComponent {
        InterceptPane() {
            // надо включить события от мыши
            enableEvents(MouseEvent.MOUSE_EVENT_MASK);
            // по умолчанию невидим и прозрачен
            setVisible(false);
            setOpaque(false);
        }

        //перехватываем события от мыши
        @Override
        public void processMouseEvent(MouseEvent e) {
            if (e.getID() == MouseEvent.MOUSE_PRESSED) {
                Component[] comps = getContentPane().getComponents();
                for (int i = 0; i < comps.length; i++) {
                    MouseEvent me = SwingUtilities.convertMouseEvent(this, e, comps[i]);
                    if (comps[i].contains(me.getPoint())) {
                        JOptionPane.showMessageDialog(null, hs.getHelpFor(comps[i]));
                    }
                }
                setVisible(false);
                getRootPane().setCursor(Cursor.getDefaultCursor());
            }
        }
    }

    class HelpSystem {
        String getHelpFor(Component comp) {
            if (comp == btn1) {
                return "Останавливает реактор. Лучше не жмите";
            } else if (comp == btn2) {
                return "Хотите лимонад? Тогда жмите смело!";
            }

            return "Даже и не знаю, что это такое";

        }
    }


    public static void main(String[] args) {
        new HelpSystemDemo();
    }
}
