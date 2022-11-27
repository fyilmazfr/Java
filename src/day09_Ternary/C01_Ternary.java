package day09_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    /* kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        System.out.println(sayi>=0 ? sayi :(-1*sayi)); // SOUT un icinde bunu yapiyoruz ve ? koyuyoruz onemli



    }

}
