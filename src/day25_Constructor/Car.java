package day25_Constructor;

public class Car {/*
        Bu class bizim kaliphanemiz
bir araba olusturmak icin ihtiyacimiz olan
variable ve methodlari bu class'da belirleriz

Sonra farkli classlarda araba olusturmaiz gerekirse
bu class'dan bir object olusturup
burada belirlenen variable ve methodlara gore araba uretiriz */


    String marka ="marka girilmedi";
    String model=" model belirtilmedi";
    int yil;
    int fiyat;

    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");

    }

    public void maxHiz(int hiz){
        System.out.println("bu arab max"+ hiz+ " km hiz yapar");
    }
}
