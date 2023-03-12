package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_08_Ternary {
    /*
    kullanicidan 4 basamaklibir sayi girmesini isteyin
    girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin

    son rakami 0 ise ekrana "5'e bolunen cift sayi" yazdirin
    son rakami 0 degil ise "5'e bolunen tek sayi yazdirin

    girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi<1000 || sayi>9999){// istenmeyen durum
            System.out.println("lutfen 4 basamakli bir sayi girin");
        }
        else if (sayi % 5 == 0) {
            System.out.println("girilen sayinin son rakami :" + (sayi % 10));

            if (sayi % 10 == 0) {
                System.out.println("5'e bolunen cift sayi");
            } else if (sayi % 10 != 0) {
                System.out.println("5'e bolunen tek sayi ");
            }


        } else if(sayi % 5 != 0) {
            System.out.println("Tekrar deneyin");

        }
    }
}
