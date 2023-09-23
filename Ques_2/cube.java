package Ques_2;

public class cube extends ThreeDShape {
    double side;

    cube (String color, double side) {
        super(color);
        this.side = side;
    }

    
    double Volume() {
        return side * side * side;
    }
}
