package Zadanie4_2;

public class Sedan extends Car implements Purchase{

    public int length;

    public Sedan(int speed, double regularPrice, String color, int length){

        super();
        this.speed = speed;
        this.regularPrice= regularPrice;
        this.color = color;
        this.length = length;

    }


    public double getSalePrice(int length, double regularPrice){

        if (length >= 20){

            return regularPrice - regularPrice * 0.05;

        }
        else{

            return regularPrice - regularPrice * 0.1;

        }

    }
    @Override
    public String getPurchaseInfo() {
        String name = "Sedan: ";
        return name;
    }

}
