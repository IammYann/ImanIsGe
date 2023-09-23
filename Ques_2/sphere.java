package Ques_2;

public class sphere extends ThreeDShape{
    double radius;

    sphere(String color, double radius) {
        super(color);
        this.radius = radius;
    }

   
    double Volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
