package EKSTRA_SORULAR;

import java.util.Scanner;

public class C01 {//Bir sayının 10 ile 100 arasında olup olmadığını bulma

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>=10 && sayi<=100){
            System.out.println("sayiniz istenen araliktadir");
        }else
            System.out.println("sayi 10-100 arasinda degildir");

    }

}
