package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElse {/*nested if ifadesi kullanarak soruyu cozen kodu yaziniz
        kullanicidan bir sifre girmesini isteyin
        eger ilk harf buyuk harf ise "A"olup olmadidigini kontrol edin
        ilk harf  A ise gecerli siffre degilse gecersiz sifre yazdirin

        eger ilk harf kucuk harf ise "z"olup olmadigini kontrol edin
        ilk harf z ise gecerli sifre degilse gecersiz sifre yazdirin
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sifre girin");
        String sifre = scan.nextLine();
        char ilkharf = scan.next().charAt(0);
        if (ilkharf >= 'A' && ilkharf <= 'Z') {
            if (ilkharf =='A') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }


        } else if (ilkharf >= 'a' && ilkharf <= 'z') {
            if (ilkharf == 'z') {
                System.out.println("gecerli harf");
            } else {
                System.out.println("gecersiz sifre");
            }
        } else {
            System.out.println("lutfen ilk harfi gecrli karakter giriniz");


        }

    }
}
