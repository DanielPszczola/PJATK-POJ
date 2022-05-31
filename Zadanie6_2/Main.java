package Zadanie6_2;

import java.util.HashSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println("HashSet: " + cars);

        ArrayList<String> NewList = new ArrayList<>(cars);
        System.out.println("Arraylist: " + NewList);
    }

}
