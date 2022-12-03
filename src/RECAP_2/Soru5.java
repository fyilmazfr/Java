package RECAP_2;

import java.util.Scanner;

public class Soru5 { //kullanicidan ismini ve soyismini girmesini isteyin,sonrasinda tam ismini
    //buyuk harfle yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi giriniz");
        String isimSoy= scan.nextLine().toUpperCase();
        System.out.println("isim soyisim :" +isimSoy);
    }
}
