package Zadanie3_2;

public class TestAuthor {

    public static void main(String args[]) {

        Author c1 = new Author("Boleslaw", "Prus", 55);

        System.out.println(c1.toString());


        Author c2 = new Author("Boleslaw", "Lesmian", 55);

        System.out.println("Author name = "+ c2.getname() + " surname = " + c2.getsurname() + " age = " + c2.getage());


        Author c3 = new Author("Eliza", "Orzeszkowa",23);
        c3.setage(34);

        System.out.println("Author name = "+ c3.getname() + " surname = " + c3.getsurname() + " age = " + c3.getage());

    }
}
