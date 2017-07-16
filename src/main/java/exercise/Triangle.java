package exercise;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle extends shape{
    private List<Point> points;
    private Point point0;
    private Point point1;
    private Point point2;


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Point getPoint0() {
        return point0;
    }

    public void setPoint0(Point point0) {
        this.point0 = point0;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }


    public void draw(){
        System.out.println("############# List of Point ###############");
        for (Point point : points){
            System.out.println("Point : " + point);
        }
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "point0=" + point0 +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
