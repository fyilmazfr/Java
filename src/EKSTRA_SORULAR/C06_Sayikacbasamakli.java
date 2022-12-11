package EKSTRA_SORULAR;

import java.util.Scanner;

public class C06_Sayikacbasamakli {////Bu örneğimizde Dışarıdan Girilen Sayının Kaç Basamaklı Oolduğunu Bulacağız

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();


       int birlerbasamagi = 0;
        int sayac = 0;


        while (sayi > 0) { // sayi sifirdan buyuk oldugu surece calissin
            birlerbasamagi = sayi%10;
            sayac++;// sayi mod dan sonra sayac artsin birer birer
            sayi /= 10;


        }
        System.out.println("girilen sayi "+sayac + "basamaklidir");


        //rakamlartoplami+=birlerbasmagi
        //int sayi/10


    }
}
