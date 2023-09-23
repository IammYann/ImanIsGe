package Ques_2;

public class cylinder extends ThreeDShape{
    double radius;
    double height;

    cylinder(String color, double radius, double height) {
        super(color);
        this.radius = radius;
        this.height = height;
    }

  
    double Volume() {
        return Math.PI * radius * radius * height;
    }
}
