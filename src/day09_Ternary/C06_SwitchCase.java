package day09_Ternary;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C06_SwitchCase {// KULLANICIDAN GUN NUMARASSINI ALIP
    // 1 ISE PAZARTESI
    //2 ISE SALI
    //.....
    //7 ISE PAZAR YAZDIRALIM
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci gun oladugunu giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

            default:
                System.out.println("lutfen gecerli bir numara giriniz");


        }

    }
}
