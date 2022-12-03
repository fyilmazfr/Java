package RECAP_1;

import java.util.Scanner;

public class Soru3 {/*kullanicidan alacaginiz vize2 vize1 ve  final notlarini vize ortalamasinin %30 U
        final notunun %70 alarak gecme notunu hesaplayiniz
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("vize1 GIR");
        double vize1=scan.nextDouble();

        System.out.println("vize2");
        double vize2= scan.nextDouble();

        System.out.println("final");
        double finalnot= scan.nextDouble();
        double vizeort=(vize1+vize2)*30/100;
        double finalort=(finalnot*70/100);

        System.out.println(vizeort+finalort);
    }
}
