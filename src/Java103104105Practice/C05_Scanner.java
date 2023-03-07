package Java103104105Practice;

import java.util.Scanner;

public class C05_Scanner {
    /*
    kullanicidan ad soyad ve memleketini ve yasini aliniz ve terminale yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String Ad= scan.nextLine();

        System.out.println("soy isim giriniz");
        String soyIsim= scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();


        System.out.println(" isim soyisim :"+Ad+" "+soyIsim+"\n"+"yas:"+yas);

    }
}
