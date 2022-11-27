package day11_StringManipulation;

import java.util.Scanner;

public class C06_endsWith { // SORU1: kullanicidan email adresini girmesini isteyin mail
    // @gmail.com icermiyorsa LUTFEN GMAIL ADRESI GIRINIZ
    //@gmail.com ILE BITIYORSA  EMAIL ADRESINIZ KAYDEDILDI
    // @gmail.com ile bitmiyorsa LUTFEN YAZIMI KONTROL EDINIZ
    // yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in); //fatih@gmail.com
        System.out.println("lutfen mail adresini giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("LUTFEN GMAIL ADRESI GIRINIZ");
    }else if (email.endsWith("@gmail.com")) {
            System.out.println("EMAIL ADRESINIZ KAYDEDILDI");
        } else {
        System.out.println("LUTFEN YAZIMI KONTROL EDINIZ");
    }
}}
