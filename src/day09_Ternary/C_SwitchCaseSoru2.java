package day09_Ternary;

import java.util.Scanner;

public class C_SwitchCaseSoru2 {
    public static void main(String[] args) {//KUllanicidan bir sayi girmesini isteyin
        //10 Ise iki basamakli en kucuk sayi
        //100 ise uc basamakli en kucuk sayi
        //1000 ise 4 basamakli en kucuk sayi
        // diger durumlarda girdigin sayilari degistir yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();


        switch (sayi) {
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("4 basamakli en kucuk sayi");
                break;
            default:
                System.out.println("girdigin sayilari degistir");

        }

    }
}
