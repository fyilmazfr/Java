package RECAP_1;

import java.util.Scanner;

public class Soru2 { /*kullanicidan kilosunu ve boyunu alip vucut kitle endeksini hesaplayan bir program yaziniz
        ipucu:vucut
        kitle endeksi(VKI)=vucut agirligi(kg)/boy uzunlugunun karesi(m)

         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kilo");
        double kilo=scan.nextDouble();

        System.out.println("boy");
        double boy= scan.nextDouble();

        double VKI=(kilo/(boy*boy));
        System.out.println("vucut kilo endeksiniz:"+ VKI);

    }
}
