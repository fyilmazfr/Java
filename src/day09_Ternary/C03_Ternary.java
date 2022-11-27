package day09_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    // KULLANICIDAN IKI SAYI ALIN VE BUYUK OLMAYAN SAYIYI YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen 2. sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);

    }


}

