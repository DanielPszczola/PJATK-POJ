package Zadanie4_2;

public class Sedan extends Car {

    public int length;



    public double getSalePrice(int length){

        if (length >= 20){

            return 5;

        }
        else{

            return 10;

        }

    }

}
