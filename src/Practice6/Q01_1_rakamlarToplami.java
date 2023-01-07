package Practice6;

import java.util.Scanner;

public class Q01_1_rakamlarToplami {//girilen sayinin basamaklarindaki rakamlarin toplamini bulunuz ve method olusturun

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        rakamlarToplami(sayi);
        System.out.println(rakamlarToplami(sayi));



    }


    private static int rakamlarToplami(int sayi) {
        int toplam=0;
        while (sayi!=0){

            toplam+=sayi%10;
            sayi/=10;

        }
        return toplam;







    }
}
