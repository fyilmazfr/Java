package day07_IfStatements;

import java.util.Scanner;

public class C06_IfElseStatements { /* soru kullaniyica yasini sorun, eger yas 65 ten kucuk ise " emekli
 olamazsiniz, calismalisin ,yas 65 e esit veya buyuk ise  "emekli olabilirsiniz" yazdirin */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65) {
            System.out.println(+65-yas+ "yil daha calismalisiniz,emekli OLAMAZSINIZ");// 65-yas sonradan ekledim
            // IKI + nin icine yazdik
        }
        else   {
            System.out.println("emekli OLABILIRSINIZ");
        }



}}
