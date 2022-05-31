package Zadanie5_3;


import java.util.*;

public class Coffee {

    public static void main (String[] args) {

        List<String> list=new ArrayList<String>();

        list.add("espresso");
        list.add("latte");
        list.add("cappuccino");
        list.add("mocha");
        list.add("auLait");
        list.add("macchiato");


        System.out.println("\n");

        System.out.println(list);

        System.out.println("\n");

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i));

        }

        System.out.println("\n");

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i).toUpperCase());

        }
        System.out.println("\n");

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i).substring(0, 4));

        }

    }

}
