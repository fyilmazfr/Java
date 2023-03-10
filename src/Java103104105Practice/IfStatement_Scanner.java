package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_Scanner {
    public static void main(String[] args) {
        /*
        soru; bir isci bir isi 10 gunde yapabilmektedir
        2 isci ayni isi kac gunde yapar

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isci sayisini giriniz");
        int isciSayisi=scan.nextInt();
        if (isciSayisi==0 ){

            System.out.println("lutfen isci sayisini giriniz");
        }else {
            int isBitmesuresi=10;
            int sonuc= isBitmesuresi/isciSayisi;
            System.out.println("IS BITME SURESI:"+sonuc);

        }



    }
}
