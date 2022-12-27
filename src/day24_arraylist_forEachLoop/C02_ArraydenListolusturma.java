package day24_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListolusturma {/*icinde 200 tane 1000 den kucuk pozitif tam sayi olan bir list olusturun
    kullanicidan bir sayi isteyin listede var olup olmadigini kullaniciya yazalim*/

    public static void main(String[] args) {
        Random rnd = new Random();//scanner gibi olusturdum
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {//sayi listesinin uzunlugu 200'e esitse calis
            sayi = rnd.nextInt(1000);//1000 den kucuk olsun
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);//200 adet sayi uretti 1000 den kucuk

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) {//true oldugu muddetce calis
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("tebrikler" + tahminSayisi + "adet tahminde listeden bir sayi buldunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + "adet sayi soylediniz ama hicbiri listede yok");
                tahminSayisi++;
            }

        }
    }}




