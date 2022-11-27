package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {// kullanicidan gun ismini alin ve hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("girilen gun haftasonu");
        }
        if
        (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba") ||
                girilenGun.equals("persembe") || girilenGun.equals("cuma")) {
            System.out.println(" girilen gun haftaici");

        }

    }

}

