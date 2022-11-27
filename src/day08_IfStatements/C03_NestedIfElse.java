package day08_IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C03_NestedIfElse {/*soru: emeklilik kontrolu yapan bir program yaziniz,cinsiyet olarak 'e' veya k' degis
    kenlerini kabul etsin ,farkli bir harf veya sembol girilirse hata mesaji versin,emeklilik icin kadinlarda yas siniri 60
    Erkeklerde 65 olsun, negatif yas veya 80den buyuk yas girilirse hata mesaji versin*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz \n" +"kadin icin K erkek icin E giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E')
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli bir karakter giriniz");
            }
        else if (yas < 65) {
            System.out.println("emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsiniz");
            ;
        }
        if (cinsiyet == 'K')
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli bir karakter giriniz");
            }
        else if (yas < 60) {
            System.out.println("emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsiniz");
            ;


        } // KADIN VE ERKEGI AYRI AYRI YAPTIK ONCE CINSIYET TANIMLADIK SONRA YAS, copy past faydalan


    }}
