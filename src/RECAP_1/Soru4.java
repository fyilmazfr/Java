package RECAP_1;

import java.util.Scanner;

public class Soru4 { /*kullanicidan a b ve c sayilarini okuyarak asadidaki islemi yapan kodu yaziniz
        a nin karesinden b nin karesini cikarip c nin uc katina bolunuz
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir a sayyisi icin bir deger giriiniz");
        double a= scan.nextDouble();

        System.out.println("b saysi icin bir deger giriniz");
        double b= scan.nextDouble();

        System.out.println("c sayisi icin bir deger giriniz");
        double c= scan.nextDouble();

        System.out.println("istenen islemin sonucu (a2-b2)/3c :"+ (a*a-b*b/3*c));

    }
}
