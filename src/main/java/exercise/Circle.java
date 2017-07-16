package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by neha on 15/7/17.
 */
public class Circle implements shape ,ApplicationEventPublisherAware {

    private Point center;
    private ApplicationEventPublisher publisher;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw(){
        System.out.println("From Circle class");
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
         this.publisher = applicationEventPublisher;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", publisher=" + publisher +
                '}';
    }
}
