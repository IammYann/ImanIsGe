package Ques_2;

public class rectangle extends TwoDShape {
    double length;
    double breadth;

    rectangle (String color, double length, double breadth){
        super(color);
        this.length= length;
        this.breadth= breadth ;
    }
    double Area(){
        return length*breadth;
    }
}
