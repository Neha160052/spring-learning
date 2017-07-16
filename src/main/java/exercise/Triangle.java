package exercise;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle extends shape {

    private String type;
    private int height;

    Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(){
        System.out.println("Draw " + type + " Triangle of height " + height);
    }
}
