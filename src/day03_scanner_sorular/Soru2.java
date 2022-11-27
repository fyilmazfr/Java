package day03_scanner_sorular;

import java.util.Scanner;

public class Soru2 {//KULLANICIDAN KARENIN BIR KENAR UZUNLUGUNU ALIN VE KARENIN CEVRESINI VE ALANINI HESAPLAYIN
    //VE YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenar uzunlugunu giriniz");
        double Sayi1=scan.nextDouble();
        System.out.println(Sayi1*Sayi1);
    }
}
