package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by neha on 15/7/17.
 */
public class Circle implements shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("forcircle")
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw(){
        System.out.println("From Circle class");
    }
}
