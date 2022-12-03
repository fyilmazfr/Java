package RECAP_1;

import java.util.Scanner;

public class Soru7 {/*kullanicidan yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilodan hafif ise kan bagisi yapamaz
        18yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir

         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();


        if (yas < 18) {
            System.out.println("kan bagisi yapamazsiniz");

        }  if (yas >= 18 && kilo < 50) {
            System.out.println("kan bagisi yapamazsiniz");
        } else if (yas >= 18 && kilo > 50) {
            System.out.println("kan bagisi yapabilirsiniz");
        }
    }
}
