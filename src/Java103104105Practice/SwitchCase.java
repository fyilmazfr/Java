package Java103104105Practice;

import java.util.Scanner;

public class SwitchCase {
    /*
    hangi gun hangi dersin oladugunu gosteren bir program yaziniz
     pazartesi ve sali ise : java
     persembe ve cuma ise : selenyum
     carsamba ve cumartesi ise; SQL
     Aksi halde :izin gunu OFF
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ders giriniz");
        String gun = scan.nextLine().toLowerCase();


        switch (gun) {
            case  "pazartesi":
            case  "sali":
                System.out.println("java");
                break;

            case  "carsamba":
            case  "persembe":
                System.out.println("SQL");
                break;

            case  "cuma":
            case  "cumartesi":
                System.out.println("selenyum");
                break;



            default: {
                System.out.println("off gunu");
            }
        }
    }
}
