package EKSTRA_SORULAR;

import java.util.Scanner;

public class C03 {//Bu örneğimizde  Sıcaklık Belirli Bir Sıcaklığa Gelene Kadar Çalışan Program Yazdıracağız

    // .mesela 50 OLSUN
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sicaklik = 0;
        do {
            System.out.println("lutfen sicaklik degerini giriniz");
            sicaklik = scan.nextInt();

        } while (sicaklik < 50);
        if (sicaklik >= 50) {
            System.out.println("gecerli bir sicaklik giriniz");


        }
    }

}