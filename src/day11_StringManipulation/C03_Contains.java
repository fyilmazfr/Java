package day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains {// SORU1: kullanicidan email adresini girmesini isteyin mail
    // @gmail.com icermiyorsa LUTFEN GMAIL ADRESI GIRINIZ
    //@gmail.com ILE BITIYORSA  EMAIL ADRESINIZ KAYDEDILDI
    // @gmail.com ile bitmiyorsa LUTFEN YAZIMI KONTROL EDINIZ
    // yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresini giriniz");
         String email=scan.nextLine();
         if (!email.contains("gmail.com")){  // ! isareti icermiyorsa olur yani olumsuz mana katar
             System.out.println("LUTFEN GMAIL ADRESI GIRINIZ");
         }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {// length kullandik cunku mailden
             //oncesini bilmiyoruz sonunu kontrol ediyoruz
             System.out.println("EMAIL ADRESINIZ KAYDEDILDI");

        }else {
             System.out.println("LUTFEN YAZIMI KONTROL EDINIZ");
         }
    }
}
