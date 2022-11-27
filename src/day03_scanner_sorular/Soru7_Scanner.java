package day03_scanner_sorular;

import java.util.Scanner;

public class Soru7_Scanner {// KULLANICIDAN ISMINI ALIP ISMININ BAS HARFINI YAZDIRIN

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkharf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi:" +ilkharf);
    }
}
