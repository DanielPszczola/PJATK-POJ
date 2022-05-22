package Zadanie4_2;

public class Truck extends Ford{

    public int weight;



    public double getSalePrice(int weight){

        if (weight >= 2000){

            return 10;

        }
        else{

            return 0;

        }

    }

}
