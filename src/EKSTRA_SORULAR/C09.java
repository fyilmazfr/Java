package EKSTRA_SORULAR;

import java.util.Scanner;

public class C09 {//Bu örneğimizde Dışarıdan Girilen Cumledeki Karakter Sayısını Bulacağız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();
        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {// lengt-1 yaparsak bosluk sayilmamis olur
            sayac++;

        }
        System.out.println("girilen deger bosluk dahil "+sayac+" " +"karakterdir");

}}
