package day46_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);//Reus. class'indan map olustur methodunu cagirdik Map'de

        //valu'lari sira numarali olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);/*1- Ali, Can, JDev
        2- Enes, Cem, Tester
        3- Taha,Emre,JDev
        4- Derya, Deniz, Tester
        */

        //Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList =ReusableMethods.isimSoyisimListeOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi :"+sinifisimsoyisimList);//isim soyisim listesi :[Ali  Can, Enes  Cem, Taha Emre, Derya  Deniz]

    }
}
