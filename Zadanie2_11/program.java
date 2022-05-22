package Zadanie2_11;

class Vehicle {

    int passengers;
    int fuelcap;
    double lkm;

}

public class program {

    public static void main(String[] args){

        int range;
        int range2;

        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        miniVan.passengers = 8;
        miniVan.fuelcap = 80;
        miniVan.lkm = 12.5;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 40;
        sportsCar.lkm = 23.4;

        range = (int) (miniVan.fuelcap / miniVan.lkm * 100);
        range2 = (int) (sportsCar.fuelcap / sportsCar.lkm * 100);

        System.out.println("Minivan przewozi " + miniVan.passengers + " osob na odleglosc do " + range + " kilometrow");
        System.out.println("Samochod sportowy przewozi " + sportsCar.passengers + " osob na odleglosc do " + range2 + " kilometrow");

    }
}
