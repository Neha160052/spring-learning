package exercise;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{
    private Point point0;
    private Point point1;
    private Point point2;
    private ApplicationContext context;
    private String beanName;

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

    public ApplicationContext getContext() {
        return context;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point0=" + point0 +
                ", point1=" + point1 +
                ", point2=" + point2 +
                ", context=" + context +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name : " + name);
        this.beanName = name;
    }
}
