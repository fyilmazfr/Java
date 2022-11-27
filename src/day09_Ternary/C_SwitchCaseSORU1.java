package day09_Ternary;

import javax.print.DocFlavor;
import java.util.Scanner;

public class C_SwitchCaseSORU1 {//KULLANICIDAN KACINCI AYDA OLDUGUNU SORUN VE YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen suan kacinci ayda oldugunuzu giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("lutfen gecerli bir sayi giriniz");


        }




    }
}
