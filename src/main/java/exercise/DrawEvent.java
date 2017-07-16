package exercise;

import org.springframework.context.ApplicationEvent;

/**
 * Created by neha on 16/7/17.
 */
public class DrawEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public DrawEvent(Object source) {
        super(source);
        System.out.println(source.toString());
    }

    @Override
    public String toString() {
        return "Draw event has been triggered";
    }
}
