package Practice6;

import java.util.Scanner;

public class Q01_WhileLoop_rakamlarToplam {//girilen sayinin basamaklarindaki rakamlarin toplamini bulunuz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giniz");
        int sayi= scan.nextInt();
        int birlerbasamagi;
        int rakamlarToplami=0;

        while (sayi>0){
            birlerbasamagi=sayi%10;
            rakamlarToplami+=birlerbasamagi;
            sayi/=10;


        }
        System.out.println("girilen sayinin rakamlari toplami :"+rakamlarToplami);
    }

}
