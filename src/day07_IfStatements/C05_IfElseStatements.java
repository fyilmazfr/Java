package day07_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {/* SORU: kullanicidan  bir karakter girmesini isteyin ve girilen karakterin
     harf olup olmadigini yazdirin*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf =scan.next().charAt(0);
        if ((harf>='a') && harf<='z' || (harf>='A' && harf<='Z')) {
            System.out.println("girilen karakter harftir");

            } else {
            System.out.println(" girilen karakter bir harf degildir");
        }
    }

}
