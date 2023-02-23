package day39_Exceptions;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /* soru; kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir sayi girerse
       eXCEPTION VERECEK SEKILDE YAZIN
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("yasiniz;"+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("yas negatif olamaz");
        }
    }
}
