package Zadanie4_1;

public class Cylinder extends Circle {

    private double height = 4.0;

    //--------------------constructor---------------------------------

    public Cylinder(){

        super();

    }

    public Cylinder(double radius){

        super();
        this.radius = radius;

    }
    public Cylinder(double radius, double height){

        super();
        this.radius = radius;
        this.height = height;

    }

    //-----------------------getters----------------------

    public double getHeight(){

        return height;

    }
    public double getVolume(){

        return Math.PI*(radius*radius)*height;

    }

}
