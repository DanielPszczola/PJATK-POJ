package Zadanie3_1;

public class TestCircle {

    public static void main(String args[]) {

        Circle C1 = new Circle();

        Circle C2 = new Circle(2.0);

        Circle C3 = new Circle(4.0,"blue");

        Circle C4 = new Circle();
        C4.setRadius(7.0);
        C4.setColor("green");

        //----------------------------------------------------------------------

        //print C1
        System.out.println("The circle has radius of "
                + C1.getRadius() + " and area of " + C1.getArea()
                + " and color of " + C1.getColor());
        System.out.println(C1.toString());

        //print C2

        System.out.println("The circle has radius of "
                + C2.getRadius() + " and area of " + C2.getArea()
                + " and color of " + C2.getColor());
        System.out.println(C2.toString());

        //print C3

        System.out.println("The circle has radius of "
                + C3.getRadius() + " and area of " + C3.getArea()
                + " and color of " + C3.getColor());
        System.out.println(C3.toString());

        //print C4

        System.out.println("The circle has radius of "
                + C4.getRadius() + " and area of " + C4.getArea()
                + " and color of " + C4.getColor());
        System.out.println(C4.toString());

    }
}
