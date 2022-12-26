package day24_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C02_ArraydenListolusturma {/*icinde 200 tane 1000 den kucuk pozitif tam sayi olan bir list olusturun
    kullanicidan bir sayi isteyin listede var olup olmadigini kullaniciya yazalim*/

    public static void main(String[] args) {
        Random rnd = new Random();//scanner gibi olusturdum
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {//200 ADET SAYI OLustursun
            sayi = rnd.nextInt(1000);//1000 den kucuk olsun
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);//200 adet sayi uretti 1000 den kucuk

    }
}




