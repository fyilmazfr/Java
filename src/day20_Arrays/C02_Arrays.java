package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];// parantez icin uzunluktur yazmassak java bizi uyarir

        System.out.println(sayilar);//[I@4c203ea1
        //non primitive data turunde ki datalari herzaman DIREK
        // yazdiramayabiliriz
        // array i yazdirmak istersek java daki arrays class indan yardim isteriz
        System.out.println(Arrays.toString(sayilar));// [0, 0, 0]
        sayilar[2]=10;// okunusu; sayilarin ikinci indeksi 10 olsun
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));//format bu sekilde olmali

        String sinifLIST[]={"ali","ayse","ahmet"};//direk deger atayabiliriz
        System.out.println(Arrays.toString(sinifLIST));
         //peki biz su sekilde yapsak java itiraz edermi?
        sinifLIST[1]="hasan";
        System.out.println(Arrays.toString(sinifLIST));// ayse gitti yerine hasan geldi

        System.out.println(sinifLIST[1]); // sadece hasani yazdiralim
        System.out.println(sinifLIST[2]);// sadece ahmet i yazdiralim


    }
}
