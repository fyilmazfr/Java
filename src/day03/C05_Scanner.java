package day03;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        // KULLANICIDAN IKI SAYI ALIP BU SAYILARIN CARPIMINI YAZDIRIN
        //1. ADIM SCANNER OBJESI OLUSTURMAK AMAC KULLANICIYA GIRIS YAPTIRMAK BU YUZDEN SCANNER SCAN = NEW SCANNER
        // SYSTEM IN YAPIYORUZ
        Scanner scan = new Scanner(System.in);
        //2. ADIM
        System.out.println("lutfen ilk sayiyi giriniz");
        //3.ADIM
        double sayi1= scan.nextDouble();

        // 2.SAYI ICIN 2. VE 3. ADIMLARI TEKRARLAYIN
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();

        System.out.println(sayi1*sayi2);



    }
}