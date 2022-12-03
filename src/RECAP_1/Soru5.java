package RECAP_1;

import java.util.Scanner;

public class Soru5 {/*bir iscinin isi bitirme suresini ve toplam isci sayisini alarak isin bitme suresini hesaplayan kodu
        yaziniz
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("bir iscinin isi bitirme suresini giriniz= a");
        double a= scan.nextDouble();

        System.out.println("toplam isci sayisi giriniz= b");
        double b= scan.nextDouble();



        System.out.println("isin bitme suresi:"+ a*1/b+ " gun");


    }
}
