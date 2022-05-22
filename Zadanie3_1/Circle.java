package Zadanie3_1;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    //constructors

    //1
    public Circle(){

        super();

    }

    //2
    public Circle(double radius){

        super();
        this.radius = radius;

    }

    //3
    public Circle(double radius, String color){

        super();
        this.radius = radius;
        this.color = color;

    }

    //getters

    public double getRadius(){

        return radius;

    }
    public String getColor() {

        return color;

    }

    public double getArea(){

        return Math.PI * Math.pow(radius, 2);

    }

    //setters

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color= color;
    }

    //tostring

    public String toString() {
        return "Circle:  radius = "+radius
                + "  Color = " + color;
    }
}

