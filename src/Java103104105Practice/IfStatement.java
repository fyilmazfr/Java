package Java103104105Practice;

import java.util.Scanner;

public class IfStatement {
    /*
    kullanicidan Y/N ikilisinden birisini girdiginde degeri ekrana yazdiran kodu yaziniz
    input Y--> OUTPUT -->> YES
    input N-->               NO

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bugun hava yagmurlumu;? YES Veya NO cevap veriniz");
        String cevap= scan.nextLine();
       String cevap1= cevap.toUpperCase();


        if (cevap1.equals("YES")){
            System.out.println("bugun piknik gunu");

            }
        else if (cevap1.equals("NO")){
            System.out.println("bugun hava yagmurlu baska bir gune planlama yapiniz");


        }


        else {
            System.out.println("gecerli yazi tipinde cevap veriniz");

        }

    }
}
