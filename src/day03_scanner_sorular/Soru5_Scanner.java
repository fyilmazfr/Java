package day03_scanner_sorular;

import java.util.Scanner;

public class Soru5_Scanner {//KULLANICIDAN ISMINI VE SOYISMINI ISTEYIP ASAGIDAKI SEKILDE YAZDIRIN
    // Isminiz: melih
    // SOYISMINIZ YILMAZ
    // kursumuza katiliminiz alinmistir tesekkur ederiz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz");
        String isim=scan.nextLine();
        System.out.println("soyisminiz");
        String soyisim= scan.nextLine();
        System.out.println("isminiz: "+ isim+"\nsoyisminiz: "  +soyisim+" \n kaydiniz alinmistir tesekkur ederiz");


    }
}
