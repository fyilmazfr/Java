package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        Collections.sort(urunler);
        System.out.println(urunler);//[cay, cekirdek, ikram, nutella] siraladi
        /*list ile gelen sort method'un siralama ozelligini girmek gerekiyor,bunun yerine Collections class'indan
        sort method'unu kullaniyoruz bu method listemizi natural order'a gore siralar

        NOT;CLEAR ethodunu hoca anlatmadi temizliyor bu method
         */
    }
}
