package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String> urunler2=new ArrayList<>();
        urunler2.add("nutella");
        urunler2.add("cay");
        urunler2.add("ikram");
        urunler2.add("cekirdek");

        System.out.println(urunler.equals(urunler2));//false verdi cunku siralama degisik

        Collections.sort(urunler);
        Collections.sort(urunler2);//bu sekilde siralamayi esitledik
        System.out.println(urunler.equals(urunler2));//true

    }
}
