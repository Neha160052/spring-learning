package exercise;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle extends shape {
    private Point point0;
    private Point point1;
    private Point point02;

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

    public Point getPoint02() {
        return point02;
    }

    public void setPoint02(Point point02) {
        this.point02 = point02;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point0=" + point0 +
                ", point1=" + point1 +
                ", point02=" + point02 +
                '}';
    }
}
