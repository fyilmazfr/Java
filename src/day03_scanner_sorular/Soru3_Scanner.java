package day03_scanner_sorular;

import java.util.Scanner;

public class Soru3_Scanner {//KULLANICIDAN YARICAP ISTEYIP CEMBERIN CEVRESINI VE DAIRENIN ALANINI
    //HESAPLAYIP YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dairenin r=yaricapini giriniz");
        double r=scan.nextDouble();
        Double alan=(3.14*r*r);
        System.out.println("Alan : " +alan);
        Double cevre=(2*3.14*r);
        System.out.println("cevre:" +cevre);


    }
}
