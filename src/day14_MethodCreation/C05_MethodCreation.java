package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreation {//kullanicidan sehir ismini ve dogum tarihini alip

    //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
    //sehir ismini buyuk ay olarak tarihi ise 2022-06-30
    //seklinde kullanmak istiyoruz
    public static void main(String[] args) {


        String tarih = tarihAl();
        String sehir = sehirAl();
        System.out.println(tarih + " " + sehir);
    }

    private static String tarihAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dogum yilinizi giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {

        } else
            System.out.println("lutfen gecerli bir yil giriniz");
        System.out.println("ay giriniz");
        int ay = scan.nextInt();

        if (ay < 0 || ay > 12) {
            System.out.println("lutfen gecerli ay giriniz");

        }
        System.out.println("gun");
        int gun = scan.nextInt();

        if (gun < 0 || gun > 30) {
            System.out.println("lutfen gecerli gun girin");

        } else
            System.out.println("dogum tarihiniz:" + yil +" " + ay +" "+ gun );


        return tarihAl();
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dogum yerini giriniz");
        String DOGUMYERI = scan.nextLine();


        return DOGUMYERI;
    }

}

