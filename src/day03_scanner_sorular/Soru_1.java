package day03_scanner_sorular;

import java.util.Scanner;

public class Soru_1 {// KULLANICIDAN IKI TAM SAYI ALIP BU SAYILARIN
    //TOPLAM,FARK VE CARPIMLARINI YAZDIRIN,kullanicidan deger alma deyince scanner kullaniriz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz");
        int Sayi1=scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int Sayi2=scan.nextInt();
        System.out.println(Sayi1*Sayi2);
        System.out.println(Sayi1+Sayi2);
        System.out.println(Sayi1-Sayi2);
        // TAM SAYI ISTEDIGI ICIN INT SECTIM. FAKAT KULLANICI ORN: yasi ondalik li ise bunu double ile yapacaktik


    }
}
