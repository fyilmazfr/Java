package Practice5;

import java.util.Scanner;

public class Q01_ForLoop {/*
        kullanicidan bir harf girmesini isteyiniz girilen harf sesli ise sesli harf oldugunu
        degilse sessiz harf oldugunu ekrana yazdirsin.girdigi deger harf degilse yada 1 karakterden fazla ise
        hata mesaji gostersin
        test girilen harfin buyuk yada kucuklugune duyarlidir
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf = scan.nextLine().toLowerCase();
        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnprstxqwyzw";

        if (harf.length() == 1) {

            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (sesliHarfler.contains(harf)) {
                    System.out.println("sesli harf");
                    break;//donguyu kirdim
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println("sessiz harf");
                    break;
                } else {
                    System.out.println("yanlis karakter girdiniz");
                    break;
                }
            }

        } else System.out.println("tek karakter giriniz");// for dongusunun disi
    }
}
