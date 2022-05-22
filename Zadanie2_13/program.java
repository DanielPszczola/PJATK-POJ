package Zadanie2_13;

class Vehicle {

    int passengers;
    int fuelcap;
    double lkm;

}

public class program {

    public static int range(int fuelcap, double lkm) {
        int range = (int) (fuelcap / lkm * 100);
        /*
        System.out.println("Zasieg (km): " + range);
        */
        return range;
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



        System.out.println("Minivan przewozi " + miniVan.passengers + " osob na odleglosc do " + range(miniVan.fuelcap, miniVan.lkm) + " kilometrow");

        System.out.println("Samochod sportowy przewozi " + sportsCar.passengers + " osob na odleglosc do " + range(sportsCar.fuelcap, sportsCar.lkm) + " kilometrow");


    }

}
