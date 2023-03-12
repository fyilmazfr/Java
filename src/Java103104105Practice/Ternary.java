package Java103104105Practice;

import java.util.Scanner;

public class Ternary {
    /*
    kullanicidan final notunu 'A' ,'B' ,'C' seklinde girmesini isteyiniz
    'A' cok basarili
    'B' Basarili
    'C' orta
    bu notlar disindakilere  de
     Digerleri....
     yazdiriniz
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        String finalNotu=input.next();


        String sonuc=(finalNotu.equalsIgnoreCase("A"))   ?  "cok basarili" :
                (finalNotu.equalsIgnoreCase("B"))        ?  "basarili" :
                  (finalNotu.equalsIgnoreCase("C"))      ? "ORTA"     :
                          "digerleri";

        System.out.println(sonuc);

    }
}
