package Practice2;

import java.util.Scanner;

public class Qs01_StringManipulation { // SCANNER KULLANARAK IKI AYRI DEGER GIRINIZ VE BU IKI KELIMEYI
    // STRING MANIPULATION METHOD KULLANARAK BIRLESTIRINIZ
    // YUKARIDAKI ORNEKTE VERILEN ILK VE IKINCI DEGISKENLERININ ILK HARFLERINI ATIP BIRLESTIRINIZ

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim1= scan.nextLine();
        System.out.println("lutfen ikinci bir isim giriniz");
        String isim2= scan.nextLine();


        System.out.println(isim1.concat(isim2));
        System.out.println(  isim1.substring(1)+isim2.substring(1));
    }
}
