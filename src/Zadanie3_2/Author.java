package Zadanie3_2;

public class Author {

    private String name;
    private String surname;
    private int age;


    public Author(String name, String surname, int age){

        super();

        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    //------------------------------getters-------------------------------------

    public String getname(){

        return name;

    }
    public String getsurname(){

        return surname;

    }
    public int getage(){

        return age;

    }

    //---------------------------------setter--------------------------------------

    public void setage(int age){

        this.age = age;

    }

    //-----------------------------------toString------------------------------------

    public String toString() {

        return "Author name = "+ name + " surname = " + surname + " age = " + age;

    }


}
