package day09_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    /*
    kullanicidan bir sayi alin sayi pozitifse sayi pozitif" yazdirin.negatifse sayinin karesini yazdirin

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextInt();
        System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));
        /*

        EGER TERNARY ICINDEKI SONUCLAR FARKLI DATA TURLERINDE ISE ATAMA YAPAMAYIZ SADECE YAZDIRABILIRIZ
         EGER IF else icerisinde yeni kodlar varsa ternary ile yapmamiz mumkun olmaz cunku iki defa sout ile
        kullanicidan birsey isteyemeyiz , bunun yerine if else yapisini kullaniriz ornek soru asagiya yaziyorum
        SORU: kullanicidan sayi isteyin,pozitifse yazdirin, sayi negatifse bir sayi daha isteyiniz ve ikisinin carpimini
        YAZDIRIN ..... BURDA IF ELSE YAPISINI KULLANIRIZ */


    }
}
