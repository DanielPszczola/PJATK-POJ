package Zadanie6_4;

import java.util.Scanner;
import java.util.HashMap;

public class Months {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("\nEnter any number from 1 to 12:");

        int chosenNumber = number.nextInt();


        while (chosenNumber < 1 || chosenNumber > 12){

            System.out.println("Chosen number is wrong!!");
            System.out.println("\nEnter any number from 1 to 12:");
            chosenNumber = number.nextInt();

        }

        System.out.println("You chose: " + chosenNumber);
        System.out.println("Which mounth has a number " + chosenNumber + " ?");

        HashMap<Integer, String> Mounths = new HashMap<Integer, String>();

        Mounths.put(1,"January");
        Mounths.put(2,"February");
        Mounths.put(3,"March");
        Mounths.put(4,"April");
        Mounths.put(5,"May");
        Mounths.put(6,"June");
        Mounths.put(7,"July");
        Mounths.put(8,"August");
        Mounths.put(9,"September");
        Mounths.put(10,"October");
        Mounths.put(11,"November");
        Mounths.put(12,"December");

        System.out.println("\nThis mounth is " + Mounths.get(chosenNumber));

        System.out.println("\nAll mounths: " + Mounths);

    }
}
