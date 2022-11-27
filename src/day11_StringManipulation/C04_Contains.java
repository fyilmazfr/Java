package day11_StringManipulation;

import java.util.Scanner;

public class C04_Contains { // SORU: KULLANICIDAN BIR CUMLE ISTEYIN
    // Cumle "buyuk" kelimesi iceriyorsa  tum cumleyi buyuk harf olarak
    // "KUCUK" KELImesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
    //IKI kelimeyi de icermiyorsa "cumle kucuk yada buyuk kelimelerini icermiyor" yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz"); //   Java buyuk ,dunya kucuk
        String cumle= scan.nextLine();
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("karar verin buyuk yada kucuk mu yazdirayim");
        }
        else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("cumle kucuk yada buyuk kelimelerini icermiyor");
        }

    }

}
