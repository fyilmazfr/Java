package EKSTRA_SORULAR;

import java.util.Scanner;

public class C10 {// Bu örneğimizde Dısarıdan Girilen Sayının Rakamlarını Ters Çevireceğiz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        String sayi= scan.nextLine();
        for (int i = sayi.length(); i >0 ; i--) {
            System.out.print(i);

        }




}}
