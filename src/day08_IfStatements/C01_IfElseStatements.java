package day08_IfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {// SORU 5. Kullanicidan bir gun ismi yazmasini isteyin ,girilen isim gecerli bir gun

    // ise gun isminin 1.  harflerini ilk harf buyuk diger ikisi  (toplam 3)kucuk olarak yazdirin.
    // GUN ISMI GECERLI DEGILSE "Gecerli gun ismi giriniz" yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("pazartesi")){
            System.out.println("Paz");
        }
        else if (girilenGun.equals("sali")){
            System.out.println("Sal");
        }
        else if (girilenGun.equals("carsamba")) {
            System.out.println("Car");
        }
        else if (girilenGun.equals("persembe")){
            System.out.println("Per");
        }
        else if (girilenGun.equals("cuma")){
            System.out.println("Cum");
        }
        else if (girilenGun.equals("cumartesi")){
            System.out.println("Cum");
        }
        else if (girilenGun.equals("pazar")) {
            System.out.println("Paz");
        }
        else{
            System.out.println("lutfen gecerli gun ismi giriniz");

        }
    }
}
