package Projekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KartyDane {


    private final static HashMap<Integer, Integer> karta = new HashMap<>();
    private final static HashMap<Integer, Integer> kartaSrodki = new HashMap<>();
    private final List zablokowane = new ArrayList();

    public KartyDane() {}

    public void dodajKarty() {

        karta.put(1,1234);
        karta.put(2,1122);
        karta.put(3,2233);
        karta.put(4,3344);
        karta.put(5,4455);
        karta.put(6,5566);
        karta.put(7,6677);
        karta.put(8,7788);
        karta.put(9,8899);
        karta.put(10,9900);
        karta.put(11,4567);
        karta.put(12,7890);

    }
    public void dodajSrodki() {

        kartaSrodki.put(1,2000);
        kartaSrodki.put(2,5000);
        kartaSrodki.put(3,1230);
        kartaSrodki.put(4,15020);
        kartaSrodki.put(5,3251);
        kartaSrodki.put(6,55646);
        kartaSrodki.put(7,66377);
        kartaSrodki.put(8,788);
        kartaSrodki.put(9,8899);
        kartaSrodki.put(10,9900);
        kartaSrodki.put(11,45637);
        kartaSrodki.put(12,789120);

    }
    public void addZablokowane(int nrkarty) {

        zablokowane.add(nrkarty);

    }
    public boolean checkZablokowane(int nrkarty) {
        if (zablokowane.contains(nrkarty)){

            return true;

        }else {

            return false;

        }
    }
    public int getZabSize(){

        return zablokowane.size();

    }
    public void getZablokowane(int i) {

        System.out.println(zablokowane.get(i));

    }
    public int getPin(int nrkarty) {

        return karta.get(nrkarty);

    }
    public Integer getSrodki(int nrkarty) {

        return kartaSrodki.get(nrkarty);

    }
    public void setSrodki(int nSrodki, int nrkarty) {

        kartaSrodki.put(nrkarty,nSrodki);

    }
}
