package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseStatements {// SORU:7KULLANICIDAN 100 UZERINDEN NOTUNU ISTEYIN. NOTU HARF SISTEMINE CEVIRIP
    // YAZDIRIN.50'DEN KUCUKSE "D", 50-60 arasi "C" 60-80 arasi "B", 80'nin uzerindeyse "A" yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 uzerinden notunuzu giriniz");
        double not= scan.nextDouble();
        if (not<50){
            System.out.println("D");
        }
        else if (not>50 && not<=60) {
            System.out.println("C");
        }
        else if (not>60 && not<=80) {
            System.out.println("B");
        }
        else {
            System.out.println("A"); // BU KISMA SADECE ELSE YAPTIK CUNKU BASKA BIR SECENEK ZATEN KALMADI
        }
    }
}
