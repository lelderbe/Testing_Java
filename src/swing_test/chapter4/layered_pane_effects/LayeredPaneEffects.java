package swing_test.chapter4.layered_pane_effects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11.09.2016.
 */
public class LayeredPaneEffects extends JFrame {
    public LayeredPaneEffects() {
        super("LayeredPaneEffects");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel buttons = new JPanel();
        buttons.add(new JButton("Применить"));
        buttons.add(new JButton("Записать"));
        buttons.add(new JTextField(20));
        getContentPane().add(buttons);
        Animation an = new Animation();
        an.setBounds(50, 10, anim.getWidth(this), anim.getHeight(this));
        getLayeredPane().add(an, JLayeredPane.PALETTE_LAYER);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private Image anim = new ImageIcon("C:\\TEMP\\image.gif").getImage();
    class Animation extends JComponent {
        public Animation() {
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
            g2.drawImage(anim, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        new LayeredPaneEffects();
    }
}
