package swing_test.chapter2_events.customcomponent;

import javax.swing.*;

/**
 * Created by user on 07.09.2016.
 */
public class SimpleButtonTest extends JFrame {

    SimpleButton button;

    public SimpleButtonTest() {
        super("SimpleButtonTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contents = new JPanel();

        contents.add(button = new SimpleButton());
        button.addButtonPressListener(new ButtonPressListener() {
            @Override
            public void buttonPressed(ButtonPressEvent e) {
                System.out.println("Pressed 1!" + e);
            }
        });

        button.addButtonPressListener(new ButtonPressed());

        getContentPane().add(contents);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleButtonTest();
    }

    class ButtonPressed implements ButtonPressListener {

        @Override
        public void buttonPressed(ButtonPressEvent e) {
            System.out.println("Pressed 2!" + e);
        }
    }
}
