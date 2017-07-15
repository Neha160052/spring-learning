package exercise;

/**
 * Created by neha on 15/7/17.
 */
public class Triangle extends shape {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println("Draw " + type + " Triangle");
    }
}
