package Zadanie5_2;

public class TestMovable {

    public static void main (String[] args) {

        Movable m1 = new MovablePoint(10, 10);
        System.out.println(m1.toString());
        System.out.println("moveLeft");
        m1.moveLeft();
        System.out.println(m1.toString() + "\n");

        Movable m2 = new MovablePoint(10, 10);
        System.out.println(m2.toString());
        System.out.println("moveRight");
        m2.moveRight();
        System.out.println(m2.toString() + "\n");

        Movable m3 = new MovablePoint(10, 10);
        System.out.println(m3.toString());
        System.out.println("moveDown");
        m3.moveDown();
        System.out.println(m3.toString() + "\n");

        Movable m4 = new MovablePoint(10, 10);
        System.out.println(m4.toString());
        System.out.println("moveUp");
        m4.moveUp();
        System.out.println(m4.toString() + "\n");

    }

}
