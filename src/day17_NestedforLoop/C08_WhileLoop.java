package day17_NestedforLoop;

import java.util.Scanner;

public class C08_WhileLoop {// soru: kullanicidan toplanmak uzere sayi alin
    //SAYILARIN TOPLAMI 500 U GECINCE SAYILARIN TOPLAMINI VE KAC SAYI TOPLANDIGINI YAZDIRIN
    public static void main(String[] args) {


        int sayi;
        int sayac=0;
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        while (toplam<500){
            System.out.println("bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;


        }
        System.out.println(sayac+ "SAYI GIRDINIZ VE TOPLAMLARI:"+toplam);
    }
}
