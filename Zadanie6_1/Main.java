package Zadanie6_1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");

        System.out.println("\n");
        System.out.println("The Original linked list: " + colors);

        System.out.println("Element removed: " + colors.removeFirst());

        System.out.println("Element removed: " + colors.removeLast());

        System.out.println("The New linked list: " + colors);



    }

}
