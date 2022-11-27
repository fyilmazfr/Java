package day03_scanner_sorular;

import java.util.Scanner;

public class Soru6_Scanner {//KULLANICADAN ISIM SOYISIM ALIP ARALARINDA BIR BOSLUK OLUSTURARAK ASAGIDAKI SEKILDE YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz");
        String isim=scan.nextLine();
        System.out.println("soyisminiz");
        String soyisim=scan.nextLine();
        System.out.println("isim - soyisim : "+isim+" "+soyisim);
    }
}
