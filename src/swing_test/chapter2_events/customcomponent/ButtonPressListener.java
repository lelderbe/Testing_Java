package swing_test.chapter2_events.customcomponent;

import java.util.EventListener;

/**
 * Created by user on 07.09.2016.
 */
public interface ButtonPressListener extends EventListener {
    void buttonPressed(ButtonPressEvent e);
}
