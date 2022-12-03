package RECAP_2;

import java.util.Scanner;

public class Soru3 {//girilen uc haneli bir sayinin okunusunu sayi ile yazdiriniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 HANELI BIR SAYI GIRINIZ");
        int sayi= scan.nextInt();
        int birlerbas=sayi%10, onlarbas=(sayi/10) %10 , yuzlerbas=sayi/100;
        // COKLU ATAMA yaptik

        if (sayi>99 &&  sayi<1000) {// her basamak icin case olusturcaz
            switch (yuzlerbas) {
                case 0: System.out.println("");break;
                case 1: System.out.println("yuz\t");break; //
                case 2: System.out.println("IKIyuz\t");break;
                case 3: System.out.println("ucyuz\t");break;
                case 4: System.out.println("dortryuz\t");break;
                case 5: System.out.println("besyuz\t");break;
                case 6: System.out.println("altiyuz\t");break;
                case 7: System.out.println("yediyuz\t");break;
                case 8: System.out.println("sekizyuz\t");break;
                case 9: System.out.println("dokuzyuz\t");break;
            }
            switch (onlarbas) {
                case 0: System.out.println("");break;
                case 1: System.out.println("on\t");break; // \T bir alta indirir
                case 2: System.out.println("yirmi\t");break;
                case 3: System.out.println("otuz\t");break;
                case 4: System.out.println("kirk\t");break;
                case 5: System.out.println("elli\t");break;
                case 6: System.out.println("altmis\t");break;
                case 7: System.out.println("yetmis\t");break;
                case 8: System.out.println("seksen\t");break;
                case 9: System.out.println("doksan\t");break;
            }
            switch (birlerbas) {
                case 0: System.out.println("");break;
                case 1: System.out.println("bir\t");break; // \T isareti bosluk
                case 2: System.out.println("iki\t");break;
                case 3: System.out.println("uc\t");break;
                case 4: System.out.println("dort\t");break;
                case 5: System.out.println("bes\t");break;
                case 6: System.out.println("alti\t");break;
                case 7: System.out.println("yedi\t");break;
                case 8: System.out.println("sekiz\t");break;
                case 9: System.out.println("dokuz\t");break;
            }
        }else
            System.out.println("3 basamakli sayi giriniz");






    }
}
