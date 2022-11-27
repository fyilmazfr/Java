package day07_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("sayi pozitiftir");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cifttir");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in katidir");
        } else {
            System.out.println("sayi 5'in kati degildir");


        }

    }
}