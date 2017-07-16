package exercise;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by neha on 16/7/17.
 */
@Component
public class MyEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("#########################################");
        System.out.println(event);
        System.out.println("#########################################");
    }
}
