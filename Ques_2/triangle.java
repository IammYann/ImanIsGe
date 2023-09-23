package Ques_2;

public class triangle extends TwoDShape {
    
    double base;
    double height;

    triangle (String color,double base,double height){
        super(color);
        this.base=base;
        this.height=height;
    }
    double Area(){
        return 1/2 * base *  height;
    }
    
}
