package Practice1;

import java.util.Scanner;

public class Q09_Scanner2 {
    /*KULLANICIYA AD MEMLEKET SUANKI KONUM YAS BOY SORAN BIR PROGRAM OLUSTURUNUZ
    VE YASADIKLARI YERI SEVIYORLARSA
            BU BILGIYI YAZDIRIN


       */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim");
        String isim= scan.nextLine();

        System.out.println("memleket");
        String memleket=scan.nextLine();

        System.out.println("konum");
        String Konum=scan.nextLine();

        System.out.println("yas");
        int yas= scan.nextInt();

        System.out.println("boy");
        double boy=scan.nextDouble();
        System.out.println("yasadiginiz yeri seviyor musunuz");
        String yasasigiYerSeviyorMu=scan.nextLine();







    }
}
