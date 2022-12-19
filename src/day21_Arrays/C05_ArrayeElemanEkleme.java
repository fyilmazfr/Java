package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {// verilen bir array'e yeni bir element ekleyen method olusturun

    public static void main(String[] args) {
        String [] sinifListesi={"meva","melih","fatih","ilknur"};
        String eklenecekIsim="akif";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));//bu soutu en son returnumuz yazdirsin diye koyuyoruz
    }

    public  static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi=new String[sinifListesi.length+1];
    //null,null defold deger atadi cunku deger atamadik
        //eski listeden bir eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
            //oncelikle eski listedeki tum elemanlari yeni listeye tasidim
        }

          yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        //eklenecek ismi , son indexe ekledim length-1 sayesinde ,ekledim

          return yeniSinifListesi;
    }

}
