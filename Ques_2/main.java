package Ques_2;

public class main {
    public static void main (String[] args){
        rectangle rectangle =new rectangle("Red",4,5);
        triangle triangle=new triangle ("Blue",1,2);
        circle circle=new circle("Pink",4);
        cube cube = new cube("Yellow", 4.0);
        sphere sphere = new sphere("Purple", 3.0);
        cylinder cylinder = new cylinder("Orange", 2.0, 5.0);

        rectangle.filled();
        System.out.println("Area of rectangle = "+rectangle.Area());

        triangle.filled();
        System.out.println("Area of triangle = "+triangle.Area());

        circle.filled();
        System.out.println("Area of circle = "+circle.Area());
        cube.filled();
        System.out.println("Cube Volume: " + cube.Volume());

        sphere.filled();
        System.out.println("Sphere Volume: " + sphere.Volume());

        cylinder.filled();
        System.out.println("Cylinder Volume: " + cylinder.Volume());
    }
}
