package RECAP_2;

import java.util.Scanner;

public class Soru2_Switch { /*kullanicidan ilk uc buyuk harften biri secildiginde cumle yazdiran kod yaziniz
        ornek:
        kullanici A B C harflerinden birini secsin
        A yi secmis ise=java is easy
        B yi secmis ise=java is fun
        C yi secmis ise=i need to study :)
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("A,B,C harflerinden birini seciniz");
        char harf=scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'A':
                System.out.println("java est facile");
                break;
            case 'B':
                System.out.println("java est amusant");
                break;
            case 'C':
                System.out.println("je besoin de etudier");
                break;
            default:
                System.out.println(" gecerli harf giriniz");
        }
    }
}
