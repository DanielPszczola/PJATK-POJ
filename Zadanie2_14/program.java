package Zadanie2_14;

import java.util.Scanner;

public class program {

    public static boolean czyParzysta(int liczba){

        return liczba % 2 == 0;

    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int liczba;
        System.out.println("Podaj dowolna liczbe:");

        liczba = scanner.nextInt();

        if ( czyParzysta(liczba) == true){

            System.out.println(liczba + " jest parzysta");

        }
        else {

            System.out.println(liczba + " jest nieparzysta");

        }


    }

}
