package Projekt;

import java.util.Scanner;

public class bankomat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int powrot = 0;
        int nrkarty;
        int pin;
        int limit = 1;

        KartyDane karty = new KartyDane();
        karty.dodajKarty();
        karty.dodajSrodki();

        menu menu = new menu();

        System.out.println("\n       Witaj w Wirtualnym Bankomacie Szmallenium\n\n");



        do {

            System.out.println("          [ Podaj nr. karty ] ");

            nrkarty = scanner.nextInt();

            if (karty.checkZablokowane(nrkarty) == false){

                System.out.println("         Witaj [ " + nrkarty + " ] podaj pin:");

                while (limit <= 3) {
                    pin = scanner.nextInt();
                    if (pin == karty.getPin(nrkarty)) {

                        System.out.println("         [ Prawidlowy pin ]\n\n\n\n\n\n");
                        break;

                    } else {

                        System.out.println("         [ Nieprawilowy pin ]");
                        limit++;

                    }
                }
                System.out.println("\n\n\n\n\n\n");
                if (limit == 4){

                    karty.addZablokowane(nrkarty);
                    System.out.println("   [ Twoja karta zostala zablokowana ] \n");

                }else {

                    menu.searchChoice(nrkarty);

                }
                limit = 1;
                for (int i = 0;i < karty.getZabSize();i++){

                    karty.getZablokowane(i);

                }
            }else{

                System.out.println("   [ Twoja karta jest zablokowana ] ");

            }


            System.out.println("\n\n  [ Jezeli chcesz kontynuowac wcisnij: --> 1 <-- ]");
            System.out.println("  [ Jezeli chcesz zakonczyc wcisnij:  --> 2 <--  ]");
            powrot = scanner.nextInt();

            System.out.println("\n\n\n\n\n\n\n\n\n\n");

        }while(powrot == 1);


    }

}
