package Java103104105Practice;

import java.util.Scanner;

public class WhileLoop {
    /*
    kullanicidan toplanmak uzere sayilar isteyin
    sayi adedi 10'u gecerse yada toplam 500'u gecerse
    bu kadar sayi yeter " ...adet sayi girdiniz toplami ... " yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;
        int sayi = 0;

        while (sayac < 11 && toplam < 500) {
            System.out.println("lutfen toplami 500 gecmeyen ve toplam 10 adet sayi giriniz");
             sayi = scan.nextInt();

            toplam += sayi;
            sayac++;


        }
        if (toplam > 500) {
            System.out.println(sayac + " adet sayi girdiniz toplami " + toplam);
        }else System.out.println("bu kadar sayi yeter."+ sayac+" adet sayi girdiniz. toplami "+toplam);

    }
}
