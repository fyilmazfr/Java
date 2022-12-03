package RECAP_2;

import java.util.Scanner;

public class Soru1_Switch {  /*gunleri goeterebilen bir program yaziniz
        gun pzt veya sali ise java dersi gunleri

        gun per veya cuma ise
        selenyum dersi gunleri

        gun car veya cumartesi ise sql dersi gunleri

        aksi halde:izin gunu
        (if kullanmayin
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun giriniz");
        String gun = scan.nextLine();

        switch (gun) {
            case ("pazartesi"):
            case ("sali"):
                System.out.println("java ders gun");
                break;
            case ("persembe"):
            case ("cuma"):
                System.out.println("selenyum ders gunleri");
                break;
            case ("carsamba"):
            case ("cumartesi"):
                System.out.println("sql ders gunleri");
                break;
            default:
                System.out.println("izin gunu");

        }


    }
}
