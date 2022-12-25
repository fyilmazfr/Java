package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C03_Indexof_Lastindexof {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();//arrayliste'si stringlerden olussun ve adi urunler olsun
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));//indexof bize urunun kacinci index de oldugunun bilgisini verir
        //ve 1 yazdirir.ve indexof listesi degistirici bir hareket yapmaz.

        System.out.println(urunler.lastIndexOf("ikram"));//1yazdirir.
        //lastindexOf methodu ise aramaya son index'den baslar.arama bitip,urun bulundugunda ikiside bulunan
        //urunun index'ini verir.
        urunler.add("ikram");
        System.out.println(urunler);//[nutella, ikram, cekirdek, cay, ikram]
        System.out.println(urunler.indexOf("ikram"));//1
        System.out.println(urunler.lastIndexOf("ikram"));//4 yazdirir dikkat cunku sondan basladi ve
        // ilk gordugu ikramin indexini verdi.

        //olmayan bir elemani arartirsak?
        System.out.println(urunler.indexOf("hobby"));//-1 yazdiracak
        System.out.println(urunler.lastIndexOf("hobby"));//-1 yazdiracak

    }
}
