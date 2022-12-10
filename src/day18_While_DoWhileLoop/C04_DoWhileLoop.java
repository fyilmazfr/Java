package day18_While_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan tam sayilar alin ve kullanici cift sayi girdigi muddetce sayilari
        // yazdirin tek sayi girdiginde islemi bitirin

        Scanner sc=new Scanner(System.in);
        int sayi=0;
        do {

                System.out.println("Lutfen bir tamsayi giriniz");
                sayi=sc.nextInt();


        }while (sayi%2==0);
        System.out.println("Cift sayi giriniz");

    }
}
