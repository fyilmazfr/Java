package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 OZELLIKLERI"+kamyon1.toString());

        Kamyon kamyon2=new Kamyon ("mercedes","4140",2005,50000);
    //atama yaptiktan sonra tekrar bu sayfaya geldik
        System.out.println("kamyon2 bilgileri"+"\n"+kamyon2.toString());


        Kamyon kamyon4=new Kamyon("Scania","s540");// yeni bir constructur olusturalim, 2 parametreli
        System.out.println("kamyon bilgileri"+"\n"+kamyon4);
// iki parametreli oldugu icin fiyat ve model'e java 0 atayacaktir

    }
}
