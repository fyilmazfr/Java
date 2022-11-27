package day03_scanner_sorular;

import java.util.Scanner;

public class Soru4_Scanner {// KULLANICIDAN DIKDORTGENLER PRIZMANIN UZUN KISA KENARLARINI VE YUKSEKLIGINI
    //ISTEYIP PRIZMANIN HACMINI HESAPLAYIP YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kisa kenari girin");
        double a= scan.nextDouble();
        System.out.println("uzun kenari girin");
        double b= scan.nextDouble();
        System.out.println("yuksekli girin");
        double c= scan.nextDouble();
        System.out.println("hacim:" +a*b*c);

    }
}
