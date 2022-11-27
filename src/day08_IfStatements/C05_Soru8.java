package day08_IfStatements;

import java.util.Scanner;

public class C05_Soru8 {//kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
    //Teklif 80.000 in uzerinde ise "kabul ediyorum"
    //60 80.000 arasinda ise "konusabiliriz"
    //60.000 altinda ise "maalesef kabul edemem" yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir teklif giriniz");
        int teklif= scan.nextInt();

        if (teklif<60000){
            System.out.println("malesef kabul edemem");

        }
        else if (teklif>60000 && teklif<80000){
            System.out.println("konusabiliriz");
        }
        else if (teklif>80000){
            System.out.println("kabul ediyorum");
        }
        else {
            System.out.println("konusamam");
        }
    }
}
