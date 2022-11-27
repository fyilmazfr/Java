package day07_IfStatements;

import java.util.Scanner;

public class C07_ifElseStatements { // BIR ONCEKI SORUDA NEGATIF DEGER GIRERSE UYARALIM
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas<0) {
            System.out.println("gecerli bir yas giriniz");
        }
        else  if (yas <= 65) {
            System.out.println(+65-yas+ "yil daha calismalisiniz,emekli OLAMAZSINIZ");// 65-yas sonradan ekledim
            // IKI + nin icine yazdik
        }
        else {
            System.out.println("emekli OLABILIRSINIZ");

        }

    }


}
