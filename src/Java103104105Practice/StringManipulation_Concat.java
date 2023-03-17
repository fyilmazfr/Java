package Java103104105Practice;

import java.util.Scanner;

public class StringManipulation_Concat {
    /*
    concat methodu; bir stringi diger string'e ekler.
     */
    /*
    java yukaridan asagi soldan saga calisir
     */
    public static void main(String[] args) {
        System.out.println(15+20+"MERHABA");//35MERHABA
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("merhaba"+(15+20));//merhaba35
        System.out.println("merhaba"+ 15*20);//merhaba300
        //carpma isretinin onceligi vardir merhaba300

        //soru;kullanici dan ismini soy ismini isteyin ve konsola yazdirin buyuk harfle
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.next().toUpperCase();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim= scan.next().toUpperCase();

        String x=isim+" ".concat(soyIsim);
        System.out.println(x);//FATIH YILMAZ

        System.out.println(isim+" ".concat(soyIsim));//FATIH YILMAZ


    }
}
