package Ques_2;

public class circle extends TwoDShape {
   
    double radius;

    circle (String color, double radius){
        super(color);
        this.radius = radius;
    }
    double Area(){
        return  radius * radius;
    }
}

