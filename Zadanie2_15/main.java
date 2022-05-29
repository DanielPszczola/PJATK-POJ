package Zadanie2_15;

import java.util.Scanner;

public class main {


    public static int range(int fuelcap, double lkm) {
        int range = (int) (fuelcap / lkm * 100);

        return range;
    }

    public static double HmFuel(double lkm, int Distance){


        return (Distance / 100) * lkm;

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe kilometrow do przejechania: ");
        int Distance = scan.nextInt();



        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        miniVan.passengers = 8;
        miniVan.fuelcap = 80;
        miniVan.lkm = 12.5;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 40;
        sportsCar.lkm = 23.4;



        System.out.println("Minivan potrzebuje " + HmFuel(miniVan.lkm,Distance) + " litrow paliwa");

        System.out.println("Minivan potrzebuje " + HmFuel(sportsCar.lkm,Distance) + " litrow paliwa");


    }


}
