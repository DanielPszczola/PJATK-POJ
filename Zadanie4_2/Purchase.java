package Zadanie4_2;

public interface Purchase {

    public static String getPurchaseInfo(){

        return Thread.currentThread().getStackTrace()[2].getClassName();

    }




}