package Projekt;

import java.util.Scanner;

public class menu {

    Scanner scanner = new Scanner(System.in);
    int wyplata;

    Sejf sejf = new Sejf();
    KartyDane srodki = new KartyDane();

    public void searchMenu() {
        System.out.println("\nWybierz operacje: ");
        System.out.println("1. Sprawdz stan konta.");
        System.out.println("2. Wyplac Srodki.");
        System.out.println("3. Wplac srodki.");
        System.out.println("4. Sprawdz stan sejfu.");
        System.out.println("5. Wyloguj z konta.");
    }

    public void searchChoice(int nrkarty) {
        boolean exit = false;
        do {
            searchMenu();
            switch (scanner.next()) {
                case "1" -> {
                    System.out.println("\n\n   [ Srodki na twoim koncie: ] ");
                    System.out.println("          [ " + srodki.getSrodki(nrkarty) + " zl ] \n");

                }
                case "2" -> {

                    if (srodki.getSrodki(nrkarty) == 0) {

                        System.out.print("   \n\nNa twoim koncie nie ma srodkow");

                    } else {
                        if (sejf.getSejf() == 0){
                            System.out.println("   \n\nDalsze operacje niemozliwe: pusty sejf");
                            break;
                        }else{
                            wyplataSrodkow(wyplata, nrkarty);
                        }
                    }

                }
                case "3" -> {

                    wplataSrodkow(wyplata, nrkarty);

                }
                case "4" -> {

                    System.out.print("   \n\nZawartosc sejfu: " + sejf.getSejf() + " zl\n\n");

                }
                case "5" -> {

                    exit = true;
                }
                default -> System.out.println("Podaj prawidlowa wartosc.\n");
            }
        } while (!exit);
    }
    public void wyplataSrodkow(int wyplata, int nrkarty) {
        int nSejf;
        int nSrodki;
        int zmianiaWyp;
        System.out.print("\n\n    Ile srodkow chcesz wyplacic:");
        wyplata = scanner.nextInt();
        if (sejf.getSejf() >=  wyplata) {
            if (srodki.getSrodki(nrkarty) >= wyplata){

                nSejf = sejf.getSejf() - wyplata;
                sejf.setMsejf(nSejf);
                nSrodki = srodki.getSrodki(nrkarty) - wyplata;
                srodki.setSrodki(nSrodki, nrkarty);

            } else {
                System.out.println("    \nNie posiadasz takich srodkow");
            }
        } else {

            System.out.print("   \n\nW sejfie nie ma takich srodkow");
            System.out.print(" mozesz wyplacic max: " + sejf.getSejf() + "\n");
            System.out.print("   Jezeli sie zgadzasz: [1]\n");
            System.out.print("   Jezeli sie nie zgadzasz: [2]\n");
            zmianiaWyp = scanner.nextInt();
            if (zmianiaWyp == 1) {

                nSrodki = srodki.getSrodki(nrkarty) - sejf.getSejf();
                srodki.setSrodki(nSrodki, nrkarty);
                nSejf = sejf.getSejf() - sejf.getSejf();
                sejf.setMsejf(nSejf);

            }

        }
    }
    public void wplataSrodkow(int wyplata, int nrkarty) {
        int nSejf;
        int nSrodki;

        System.out.print("   \n\nIle srodkow chcesz wplacic:");
        wyplata = scanner.nextInt();

        nSejf = sejf.getSejf() + wyplata;
        sejf.setMsejf(nSejf);
        nSrodki = srodki.getSrodki(nrkarty) + wyplata;
        srodki.setSrodki(nSrodki, nrkarty);

    }
}
