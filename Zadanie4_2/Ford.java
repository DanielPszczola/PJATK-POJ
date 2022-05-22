package Zadanie4_2;

public class Ford extends Car{

    public int year;
    public int manufacturerDiscount;


    public double getSalePrice(int manufacturerDiscount){

        return getSalePrice(regularPrice) - manufacturerDiscount;

    }

}
