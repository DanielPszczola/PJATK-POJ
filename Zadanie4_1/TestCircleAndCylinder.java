package Zadanie4_1;

public class TestCircleAndCylinder {

    public static void main(String args[]) {

        //-------------------------testCrircle----------------------------------------------

        Circle Ci1 = new Circle();

        Circle Ci2 = new Circle(3.0);

        System.out.println(Ci1.toString());

        System.out.println("The circle has radius of " + Ci2.getRadius() + " and area of " + Ci2.getArea());

        //----------------------------testCylinder----------------------------------------

        Cylinder Cy1 = new Cylinder();

        Cylinder Cy2 = new Cylinder(10.0);

        Cylinder Cy3 = new Cylinder(15.0, 5.0);

        System.out.println("Height of cylinder is " + Cy1.getHeight());

        System.out.println("Height of cylinder is " + Cy2.getHeight() + " and radius of " + Cy2.getRadius());

        System.out.println("Volume of cylinder is " + Cy3.getVolume() + " with H = " + Cy3.getHeight() + " and R = "
        + Cy3.getRadius());



    }
}
