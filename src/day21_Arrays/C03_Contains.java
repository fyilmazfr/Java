package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {// kullanicidan aldiginiz bir ismin verilen bir Array'de istenen bir elemani icerip icermedigini kontrol edip
    // bize true veya false sonucu donen bir method olusturun
    public static void main(String[] args) {
        String [] isimler={"melih","fatih","senih","meva","ilknur"};// array olusturduk
        Scanner scan=new Scanner(System.in);
        System.out.println("aradiginiz ismi giriniz");
        String arananIsim= scan.nextLine();

        boolean sonuc=contains(isimler,arananIsim);//aray'lerin icinde aranan isimler varmi methodu olusturduk
        if (sonuc){
            System.out.println("girilen isim listede var");

        }else {
            System.out.println("girilen isim listede yok");
        }
    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;// sonuc methoduna bir deger atamamiz gerekiyor bunu false atadik,degisebilir
        for (int i = 0; i <isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){// i elementi aranan isimler iceriyormu
                sonucMethod=true;
            }

        }
        return sonucMethod;
    }


}
