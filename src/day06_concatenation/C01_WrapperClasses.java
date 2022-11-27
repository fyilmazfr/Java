package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        // wrapper class javanin hazir metodlari kullanabilmemiz icin primitive data turlerinin her biri icin
        // actigi klaslardir
        String str="java ile hayat cok guzel"; // bunu tamamini buyuk harf ile yazdirmak istersem
        System.out.println(str.toUpperCase()); // to upper class yaptik

        Boolean guzelMI=true;
        Boolean buGuzelMi=true;
        buGuzelMi.toString();
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE); // bunu ezberlemeye gerek yok kisa yollari gosteriyor

        String ogrNo="123456";
        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sifre giriniz");
        String sifre= scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen sifrenin 3 fazlasi:" + (sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi:" + (sifreSayi+3));
        // WRAPPER CLASS LAR ILERDE KULLANABILECEGIMIZ PEKCOK FAYDALI HAZIR METHOD ICERIR
        // INT'in Wrapper class i  Integer dir
        // char    Character
        // digerleri primitive data turu ile ayni sadece bas harfi buyuk

    }
}
