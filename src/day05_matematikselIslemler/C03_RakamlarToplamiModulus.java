package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamiModulus {// modulus islemi bir bolme isleminde kalan sayiyi bize verir
    //SORU: kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basmakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt(); //5267 GIRSIN KULLANICI

        int birlerbasmagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi; // BUnu yaptikki ilk girilen sayiyi java bilsin diye,aksi halde en son yazdirirken
        //sayiyi 0 olarak alir
        // SUanda sayimiz 5267 birler basamagi 0  rakamlar toplami 0

        birlerbasmagi=sayi % 10;  // 7
        rakamlarToplami += birlerbasmagi;   // birler basamagina rkamlar toplamini ekleyip sonrada esitlemis olacak
        sayi/=10;
        // suanda sayimiz 526 ve suanda birler basmaginin veriables degeri 7ve rakamlar toplami suan 7

        birlerbasmagi=sayi % 10; // birler basamaginin degeri artik 6
        rakamlarToplami += birlerbasmagi; // 7+6=13
        sayi/=10;  // suandan itibaren sayi 52 oldu rakamlar toplami 13 ,ve devam ediyoruz

        birlerbasmagi=sayi %10; // Birler basamagi 2
        rakamlarToplami +=birlerbasmagi;  // 13+2=15
        sayi/=10; // SUANDA SAYI 5 rt15

        birlerbasmagi=sayi %10; //5
        rakamlarToplami +=birlerbasmagi; //15+5=20
        sayi/=10; // artik sayi 0 OLDU
        // sayinin rakamlar toplamini artik yazdirayim

        System.out.println(ilkGirilenSayi+ "sayisinin rakamlar toplami:" + rakamlarToplami);




    }



}
