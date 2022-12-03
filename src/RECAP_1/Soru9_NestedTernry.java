package RECAP_1;

import java.util.Scanner;

public class Soru9_NestedTernry { /*final notu tanimlayin,nested ternary ile cozunuz
        'A' "gayet basarili"
        'B' "basarili"
        'C' "ha gayret"
        bu notlar disindakilere de digerleri yazdiriniz
         */
    public static void main(String[] args) {


        char finalnotu='B';
        String sonuc=(finalnotu=='A') ?("gayet basarili") :(finalnotu=='B') ? ("basarili") :(finalnotu=='C') ? ("ha gayret"): ("digerleri") ;
        System.out.println(sonuc);
    }
}
