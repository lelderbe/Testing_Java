package swing_test.chapter2_events.customcomponent;

import java.util.EventObject;

/**
 * Created by user on 07.09.2016.
 */
public class ButtonPressEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonPressEvent(Object source) {
        super(source);
    }
}
