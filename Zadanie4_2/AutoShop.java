package Zadanie4_2;

public class AutoShop {

    public static void main(String args[]) {



        Sedan S1 = new Sedan(160 ,20000, "red", 10);

        Ford F1 = new Ford(156, 4452.0, "black", 2005, 10);

        Ford F2 = new Ford(155, 5000.0, "pink", 1998, 5);

        Truck T1 = new Truck(200, 500000, "gold", 5000);

        System.out.println("Sedan: "+ S1.getSalePrice(S1.length, S1.regularPrice));

        System.out.println("Ford: " + F1.getSalePrice(F1.manufacturerDiscount, F1.regularPrice));

        System.out.println("Ford: " + F2.getSalePrice(F2.manufacturerDiscount, F2.regularPrice));

        System.out.println("Truck: " + T1.getSalePrice(T1.weight, T1.regularPrice));

    }

}
