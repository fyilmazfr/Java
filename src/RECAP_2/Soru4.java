package RECAP_2;

import java.util.Scanner;

public class Soru4 { /* 0~9 arasindaki sayilari cevirebilen bir java programi yazin
        kelimelere sayi 9 dan buyuk veya 0 dan kucukse
        cikis "gecersiz" olmalidir
        nestedif ve ternary kullanarak iki yolla cozunuz
         */
    public static void main(String[] args) {

        int sayi = 9;
        String sonuc = "";
        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {
                System.out.println("dokuz");
            }
            if (sayi == 8) {
                System.out.println("sekiz");
            }
            if (sayi == 7) {
                System.out.println("yedi");
            }
            if (sayi == 6) {
                System.out.println("alti");
            }
            if (sayi == 5) {
                System.out.println("bes");
            }
            if (sayi == 4) {
                System.out.println("dort");
            }
            if (sayi == 3) {
                System.out.println("uc");
            }
            if (sayi == 2) {
                System.out.println("iki");
            }
            if (sayi == 1) {
                System.out.println("bir");
            }
            if (sayi == 0) {
                System.out.println("sifir");

            } else {
                System.out.println("gecerli sayi gir");


            }
        }
    }
}