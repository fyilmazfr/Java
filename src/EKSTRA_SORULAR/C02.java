package EKSTRA_SORULAR;

import java.util.Scanner;

public class C02 {// Bu örneğimizde Dışarıdan Girilen Sayının Asal Olup Olmadığını Bulacağız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("luyfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if  (sayi==1){
            System.out.println("SAYI ASALDIR");
        }
        else if (sayi%2==0 || sayi%3==0){
            System.out.println("asal degildir");
        }
        else if (sayi/2 != 0 || sayi / 3 != 0){
            System.out.println("ASALDIR ");

    }}}
