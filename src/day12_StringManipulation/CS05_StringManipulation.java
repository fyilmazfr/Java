package day12_StringManipulation;

import java.util.Scanner;

public class CS05_StringManipulation {// kullanicidan bir sifre girmesini isteyin
    //ASAGIDAKI SARTLARI SAGLIYORSA "sifre basari ile tamamlandi sartlari saglamazsa
    // ISLEM BASARISIZ YENI BIR SIFRE GIRIN YAZDIRIN

    //_ ilk harf buyuk harf olmali
    //_ son harf kucuk harf olmali
    // sifre bosluk icermemeli
    // _ sifre uzunlugu en fazla 8 karakter olmali
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 8 Karakterli ilk harf buyuk son harfi kucuk,bosluk icermeyen bir sifre girin");
        String sifre = scan.nextLine();
       // char ilkHarf = scan.next().charAt(0);

        if( sifre.length()>8) {
            System.out.println("Lutfen yeni bir sifre giriniz");

        } else if ((sifre.charAt(0) >= 'A' || sifre.charAt(0) <= 'Z') && (sifre.charAt(sifre.length() - 1) >= 'a' || sifre.charAt(sifre.length() - 1) <= 'z') && (!sifre.contains(" "))) {
            System.out.println("Sifreniz basari ile tamamlandi");

        } else {
            System.out.println("Lutfen gecerli bir sifre giriniz");
        }


    }
}