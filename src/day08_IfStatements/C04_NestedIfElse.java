package day08_IfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {/* kullanicidan dort basamakli bir sayi girmesini isteyin
    girdigi sayi 5 e bolunuyorsa son rakamini kontrol edin .son rakami 0
    ise ekrana 5 e bolunen cift sayi yazdirin
    son rakami 0 degilse 5 e bolunen tek sayi yazdirin
    girdigi password 5 e bolunmuyorsa ekrana tekrar deneyin yazdirin */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi<1000 || sayi>9999) {
            System.out.println("lutfen gecerli bir sayi giriniz");

        }
        else if (sayi%5==0)
            if (sayi%10==0){
            System.out.println("5 E BOLUNEN CIFT SAYI");
        }
        else if (sayi%5!=0){
            System.out.println("5 E bolunemeyen tek sayi");
        }
        else {
            System.out.println("tekrar deneyin");
        }

    }
}
