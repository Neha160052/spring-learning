package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shreya on 7/5/2017.
 */
public class Test {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        applicationContext.registerShutdownHook();
        Triangle triangle = (Triangle)applicationContext.getBean("triangle");
        System.out.println(triangle);
        triangle.draw();
    }
}
