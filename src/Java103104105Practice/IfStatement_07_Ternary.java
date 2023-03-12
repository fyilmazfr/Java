package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_07_Ternary {
    /*
    kullanicidan iki sayi alin buyuk olmayan(kucuk) sayiyi yazdirin
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        if (sayi1>sayi2){
            System.out.println("kucuk olan sayi ; "+sayi2);
        }else if (sayi1<sayi2){
            System.out.println("kucuk olan sayi ;"+sayi1);
        }else {
            System.out.println("sayilar birbirine esit");
        }

        //ternary de cozum nasil olur

        System.out.println(sayi1==sayi2 ? "sayilar esit" :sayi1>sayi2 ? sayi2 :sayi1);
        //soru isareti ise demektir true ise hemen sag taraf degilse iki noktanin hemen yani calisacak
        //ternary ic ice if demektir

    }
}
