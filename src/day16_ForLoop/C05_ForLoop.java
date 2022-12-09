package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {// sorU 10 ::KULLANICIDAN IKI SAYI ISTEYIN GIRILEN SAYILAR VE ARALARINDAKI TUM SAYILARI
    //TOPLAYIP SONUCU YAZDIRAN BIR METHOD YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi1= scan.nextInt();
        System.out.println("lutfen ikinci sayiyi girin");
        int sayi2= scan.nextInt();


        tumSayiToplam(sayi1,sayi2);
    }

    public static void tumSayiToplam(int sayi1, int sayi2) {
        int toplam=0;
        if (sayi1<sayi2){
        for (int i = sayi1; i <=sayi2 ; i++) {
            toplam += i;

        }
    }else if (sayi1>sayi2) {
            for (int i = sayi2; i <= sayi1; i++) {
                toplam += i;

            }
        }
        System.out.println("aradaki sayilarin toplami:"+ " "+toplam);
}}
