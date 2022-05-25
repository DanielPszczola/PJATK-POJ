package Zadanie4_2;

public class Ford extends Car implements Purchase{

    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){

        super();
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;

    }



    public double getSalePrice(int manufacturerDiscount, double regularPrice){

        return getSalePrice(regularPrice) - manufacturerDiscount;

    }

}
