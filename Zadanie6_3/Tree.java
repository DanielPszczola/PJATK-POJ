package Zadanie6_3;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class Tree {

    public static void main(String[] args) {

        TreeSet<String> tree1 = new TreeSet<>();

        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");


        System.out.println("Posortowane drzewo binarne:\n");

        //----------------------------A----------------------------------

        System.out.println("A) Drzewo zawierajace piec nazw kolorow:");

        System.out.println("tree1: " + tree1 + "\n");

        //--------------------------------B-----------------------------------

        System.out.println("B) Iterowanie po wszystkich elementach drzewa:");

        Iterator<String> iterate = tree1.iterator();

        for (int i = 0; i < tree1.size(); i++) {

            System.out.println(iterate.next());

        }

        //-------------------------------C------------------------------------

        TreeSet<String> tree2 = new TreeSet<>();

        tree2.add("Black");
        tree2.add("Pink");
        tree2.add("White");

        System.out.println("\nC) Dodawanie do istniejacego drzewa nowego drzewa binarnego");
        System.out.println("tree1: " + tree1);
        System.out.println("tree2: " + tree2);

        tree1.addAll(tree2);

        System.out.println("tree1 po zsumowaniu z tree2: " + tree1);

        //------------------------D-------------------------------------------

        System.out.println("\nD) Wypisanie elementow drzewa w odwrotnej kolejnosci: ");

        System.out.println("Orginalne drzewo tree1: " + tree1);
        System.out.println("Odwrotna kolejnosc: ");

        Set<String> Rset = tree1.descendingSet();

        Iterator<String> Riterate = Rset.iterator();

        while (Riterate.hasNext()) {

            System.out.println(Riterate.next());

        }

        //--------------------------E-------------------------------------

        System.out.println("\nE) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie:");

        System.out.println("tree1: " + tree1);

        System.out.println("Pierwszy element drzewa: " + tree1.first());
        System.out.println("Ostatni element drzewa: " + tree1.last());

        //----------------------------F----------------------------------------

        System.out.println("\nF) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego:");

        System.out.println("tree1: " + tree1);

        TreeSet<String> tree3 = new TreeSet<String>(tree1);

        System.out.println("Nowe drzewo tree3: " + tree3);

        //----------------------------G---------------------------------------

        System.out.println("\nG) Liczba elementow przechowywanych w drzewie: ");

        System.out.println("tree1: " + tree1);
        System.out.println("Rozmiar: " + tree1.size());

        //---------------------------H------------------------------------------

        System.out.println("\nH) Porownanie elementow przechowywanych w dwoch drzewach binarnych: ");


        for (String element : tree1){

            System.out.println("- czy element " + element + " w drzewie tree1 jest taki sam jak w tree2?");

            System.out.println(tree2.contains(element) ? "Tak" : "Nie");
        }





    }
}
