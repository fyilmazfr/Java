package Practice1;

import java.util.Scanner;

public class Q08_Scanner1 {
    // KULLANICIDAN 2 TAM SAYI ALIN? BU TAM SAYILARI TIOPLAYIP VE SONUCU YAZDIRIN
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen 2. tamsayiyi giriniz");
        int sayi2=scan.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
}
