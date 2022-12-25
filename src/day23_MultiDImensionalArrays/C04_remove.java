package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();//arrayliste'si stringlerden olussun ve adi urunler olsun
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        /*REMOVE
        1- objeyi yazip silmesini istersek bize boolean sonuc doner true-false
        2-index girersek o index'deki o elemani siler ve bize silinen elemani dondurur*/
        System.out.println(urunler);
        System.out.println(urunler.remove("ikram"));//true dondurdu, urunler listesine git ve ikram'i sil
        System.out.println(urunler);//[nutella, cekirdek, cay] yeni listemiz olustu

        //peki olmayan bir urunu sil dersek
        System.out.println(urunler.remove("hobby"));//false
        System.out.println(urunler);//[nutella, cekirdek, cay]

        //ikinci yontem yani index girelim
        System.out.println(urunler.remove(1));//en son listeye gidecek index'i 1 olani bulacak onu silecek ve delil
        //olarakta bize o urunun ismini getirecek  , cekirdek yazdirdi
        System.out.println(urunler);//[nutella, cay]

        //olmayan bir urunu remove yaparsak exception verir



    }
}
