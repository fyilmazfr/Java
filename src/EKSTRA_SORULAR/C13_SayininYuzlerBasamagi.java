package EKSTRA_SORULAR;

import java.util.Scanner;

public class C13_SayininYuzlerBasamagi { //Bu örneğimizde Dısarıdan Girilen Sayının Yüzler Basamağındaki Rakamı Bulacağız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi;
        int onlarBasamagi;
        int yuzlerBasamagi;

        for (int i = 0; i < 1000; i++) {

        }
        birlerBasamagi = sayi % 10;
        sayi /= 10;

        onlarBasamagi = sayi % 10;
        sayi /= 10;

        yuzlerBasamagi = sayi % 10;
        sayi /= 10;
        System.out.print("sayinin yuzler basamagi:"+yuzlerBasamagi);


    }


}
