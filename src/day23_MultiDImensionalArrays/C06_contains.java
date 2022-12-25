package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();//arrayliste'si stringlerden olussun ve adi urunler olsun
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler.contains("nutella"));//true
        System.out.println(urunler.contains("Hobby"));// false

        //peki ?
        List<String> urunler2=new ArrayList<>();
        urunler2.add("nutella");
        urunler2.add("ikram");
        System.out.println(urunler.contains(urunler2));//    false
        System.out.println(urunler.containsAll(urunler2));//true

        //fakat?
        urunler2.add("hobby");
        System.out.println(urunler2);//[nutella, ikram, hobby]
        System.out.println(urunler.containsAll(urunler2));//false, hobby olmadigi icin false verdi

    }

}
