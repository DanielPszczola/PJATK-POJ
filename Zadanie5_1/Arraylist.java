package Zadanie5_1;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String args[]){

        ArrayList arrayList = new ArrayList();


        for (int i = 0; i <= 100; i++){

            if ( i % 2 == 0){

                arrayList.add(i);

            }

        }

        for (int j = 0; j <= 100; j++){

            System.out.println(" [ " + j + "] = " + arrayList.get(j));

        }
    }

}
