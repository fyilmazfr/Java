package EKSTRA_SORULAR;

import java.util.Scanner;

public class C11 {//Java örneklerimizde yeni bir örnek ekleyelim. Bu örnekte dışardan girilenm saniye değerini
     //saat,dakika ve saniyeye çevireceğiz.
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("lutfen saniye degerini giriniz");
         double saniye= scan.nextDouble();
         double dakika=saniye/60;
         double saat=saniye/(60*60);
         System.out.println( "girilen saniye"+" "+dakika+ "dakika" +"\n"+saat+" "+"saattir");

}}
