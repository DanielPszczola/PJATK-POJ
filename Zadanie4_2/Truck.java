package Zadanie4_2;

public class Truck extends Car implements Purchase{

    public int weight;


    public Truck(int speed, double regularPrice, String color, int weight){

        super();
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.weight = weight;

    }


    public double getSalePrice(int weight , double regularPrice){

        if (weight >= 2000){

            return regularPrice - regularPrice * 0.1;

        }
        else{

            return regularPrice;

        }

    }

}
