package Java103104105Practice;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= scan.nextLine();
        int index=0;

        for (int i = 0; i <kelime.length() ; i++) {
            System.out.println("");//her defasinda alt satira gecmesi icin
            System.out.println(kelime.charAt(i)+"\t"+index);//char olarak loop dan geldi ,index'i kendimiz olusturuyoruz
            index++;


        }/*
        kelime girip herbir harfin index'ini beraber yazdirdik
        */
    }
}
