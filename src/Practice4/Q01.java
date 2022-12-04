package Practice4;

import java.util.Scanner;

public class Q01 {    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz dort islemi + * - / olarak seciniz");
        char islem=scan.next().charAt(0); //BURDA DORT ISLEM SIMGESINI TANIMLADIK ,tek karakter olduklari icin charAT ile yaptik

        System.out.println("lutfen bir sayi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();

        hesapMakinesi(islem,sayi1,sayi2);  // M.CREATION OLUSTURACAGIZ
    }

    public static void hesapMakinesi(char islem, double sayi1, double sayi2) {
        if (islem=='+'|| islem=='-' || islem=='*' || islem=='/' ) {
            switch (islem) {
                case '+':
                    System.out.println("sayi1+sayi2" + "=" + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("sayi1-sayi2" + "=" + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("sayi1*sayi2" + "=" + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println("sayi1/sayi2" + "=" + (sayi1 / sayi2));
                    break;
                default:
                    System.out.println(" lutfen gecerli dort islem karakteri giriniz");
            }
        }else
            System.out.println("hatali giris");




    }
}
