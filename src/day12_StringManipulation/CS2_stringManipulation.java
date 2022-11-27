package day12_StringManipulation;

import java.util.Scanner;

public class CS2_stringManipulation {
    public static void main(String[] args) {
        // SORU: kullanicidan isim isteyin eger
        // isim a harfi iceriyorsa "Girdiginiz isim a harfi iceriyor
        //isim Z harfi iceriyorsa "girdiginiz isim Z harfi iceriyor
        //ikiside yiksa "girdiginiz isim a veya z harfi icermiyor yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim=scan.nextLine().toLowerCase();
        if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (isim.contains("z")){
                System.out.println("girdiginiz isim Z harfi iceriyor");


        }else {
            System.out.println("girdiginiz isim a veya z harfi icermiyor yazdirin");
        }


    }
}
