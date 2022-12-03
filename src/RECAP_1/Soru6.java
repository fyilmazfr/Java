package RECAP_1;

import java.util.Scanner;

public class Soru6 {/*kullanicidan boyunu cm kilosunu kg olarak alip BMI (VKI)
        hesaplayiniz
        BMI=kilo(kg)/boy*boy
        bmi<=20 oldukca zayifsiniz
        20<bmi<=25 normal sinirlardasiniz
        25<bmi<=30 sisman kategorisindesiniz
        30<bmi==> obez gurubundasiniz
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("lutfen boyunuzu giriniz");
        double boy = scan.nextDouble();

        double bmi = kilo / (boy * boy);

            if (bmi <= 20) {
                System.out.println("bmi indexiniz" + bmi + "oldukca zayifsiniz");

            }else if (bmi<=25){
                System.out.println(+bmi+ "normal sinirlardasiniz");

            } else if (bmi <= 30) {
                System.out.println(+bmi+  "sisman kategorisindesiniz");
            } else if (30 < bmi) {
                System.out.println(+bmi+ "obez gurubundasiniz");

            }

        }
    }
