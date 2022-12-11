package EKSTRA_SORULAR;

import java.util.Scanner;

public class C08 {// //herhangi bir kelimenin içinde kaç tane sesli harf olduğunu bulacağız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.nextLine();

        String aranacakHarf="aeiou";
        int sayac=0;

        for (int i = 0; i <kelime.length() ; i++) {// herbir harfden sonr    bir sonrakine gecsin
            for (int j = 0; j < aranacakHarf.length(); j++) {


                if (kelime.charAt(i)==aranacakHarf.charAt(j)) {
                    sayac++;

                }


            }System.out.print(sayac);
        }}}
// Scanner scan = new Scanner(System.in);
//        System.out.println("String bir ifade giriniz");
//        String str= scan.nextLine();
//
//        String aranacakHarf="aeiou";
//        int count=0;
//        for (int i = 0; i <str.length() ; i++) {
//            for (int j = 0; j <aranacakHarf.length() ; j++) {
//
//
//            if(str.charAt(i)==aranacakHarf.charAt(j)){
//                count++;









