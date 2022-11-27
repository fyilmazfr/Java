package day12_StringManipulation;

import java.util.Scanner;

public class CS3_stringManipulation {// kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim= scan.nextLine().toLowerCase();

        System.out.println("lutfen soyisim giriniz");
        String soyisim= scan.nextLine();

        //System.out.println(isim.length());
       // System.out.println(soyisim.length());

        if (isim.length()>soyisim.length()){
            System.out.println(isim);
        }else if (isim.length()<soyisim.length()){
            System.out.println(soyisim);


        }else if ( isim.length()==soyisim.length()){
        System.out.println(" isim ve soyisim uzunlugu esittir");
    }
}}
