package Zadanie12;


class Vehicle {

    int passengers;
    int fuelcap;
    double lkm;

}
public class Main {

    public static void range(int fuelcap, double lkm) {
        int range = (int) (fuelcap / lkm * 100);
        System.out.println("Zasieg (km): " + range);

    }


    public static void main(String[] args){

        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        miniVan.passengers = 8;
        miniVan.fuelcap = 80;
        miniVan.lkm = 12.5;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 40;
        sportsCar.lkm = 23.4;



        System.out.println("Minivan przewozi " + miniVan.passengers + " osob.");
        range(miniVan.fuelcap, miniVan.lkm);

        System.out.println("Samochod sportowy przewozi " + sportsCar.passengers + " osob.");
        range(sportsCar.fuelcap, sportsCar.lkm);

    }

}
