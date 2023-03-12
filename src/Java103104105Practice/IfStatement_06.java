package Java103104105Practice;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement_06 {
    /*kullanicidan 0'dan kucuk 120'den buyuk deger giremeyecek sekilde
    eger calisan kadin ve 60yasindan buyukse emekli olabnilir
    eger calisaan erkek ve 65 yasindan buyukse emekli olabilir
    seklinde bir kod yaziniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz E vs K");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("gecerli yas giriniz");


            } else if (yas >= 65) {
                System.out.println("erkek , emekli olabilirsiniz");

            } else {
                System.out.println("emekli olamazsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("gecerli yas giriniz");


            } else if (yas >= 60) {
                System.out.println("kadin,emekli olabilir");


            } else {
                System.out.println("emekli olamazsinizf");
            }
        }
        else{
                System.out.println("lutfen gecrli bir harf giriniz");
            }
        }
    }











      /*  if (cinsiyet == 'K' || yas >= 60 && yas <= 120) {
            System.out.println("Kadin ve emekli olabilir");
            if (cinsiyet == 'E' && yas >= 65) {
                System.out.println("erkek ve emekli olabilir");
            } else if (yas > 120 || yas < 0) {
                System.out.println("gecerli yas giriniz");
            }

        } */



