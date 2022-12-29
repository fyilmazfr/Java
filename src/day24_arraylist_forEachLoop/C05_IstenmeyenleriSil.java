package day24_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        //verilen bir arrayde istenmeyen harf iceren kelimeleri silip kalan elementleri yeni bir array yapin
        String[]sehirler={"istanbul","ankara","mersin","konya","kastamonu"};
        String istenmeyenHarf="a";
        List<String> kalanlar=new ArrayList<>();//stringlerden olusan kalanlar adinda bir liste yaptik

        for (int i = 0; i < sehirler.length; i++) {
            if(!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }

        }
        //loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);//[mersin] bizden array istiyor

        //yeni bir array olusturup listeyi ona aktaralim
        String[]kalanlarArrayi=new String[kalanlar.size()];//uzunlugu listenin sayisi kadar

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]= kalanlar.get(i);

        }
        //sehirlerin var olan halini degistiremeyiz ama yeni bir sehirler array'i atayabiliriz buyuzden;
        //sehirler arrayinin yeni degerini atiyoruz
        sehirler=kalanlarArrayi;
        System.out.println(" sehirler arayninin son hali:"+ Arrays.toString(sehirler));//[mersin]
}}

