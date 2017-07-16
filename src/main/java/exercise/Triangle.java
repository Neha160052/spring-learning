package exercise;

import java.util.List;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle extends shape {


   private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        for (Point point : points){
            System.out.println("point = " + point);
        }
    }
}
