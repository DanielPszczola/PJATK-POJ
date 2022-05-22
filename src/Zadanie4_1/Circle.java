package Zadanie4_1;

public class Circle {

    public double radius = 1.0;
    private String color = "blue";

    //--------------------------constructors----------------------------------
    public Circle(){

        super();

    }
    public Circle(double radius){

        super();
        this.radius = radius;

    }

    //-------------------------------getters-------------------------------------

    public double getRadius(){

        return radius;

    }
    public double getArea(){

        return Math.PI * Math.pow(radius, 2);

    }

    //-------------------------------tostring--------------------------------------------

    public String toString() {
        return "Circle:  radius = "+radius
                + "  Color = " + color;
    }


}
