package day09_Ternary;

import java.util.Scanner;

public class C04_Ternary {// KULLANICIDAN BIR TAM SAYI ALIN VE SAYININ TEK VEYA CIFT OLDUGUNU YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println( sayi%2==0 ? "girilen sayi CIFTTIR" : "GIRILEN SAYI TEKTIR");

    }
}
