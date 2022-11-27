package day03;

import java.util.Scanner;

public class C07_Scanner {//BIR ONCEKI SORUYU TEK SEFERDE KULLANICIDAN TUM BILGILERI ALARAK YAPINIZ

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi,ve yasinizi giriniz \n aralarda enter tusuna basiniz");
        String isim= scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();    // yas isteyecegimiz icin int yi sectik

    }
}
