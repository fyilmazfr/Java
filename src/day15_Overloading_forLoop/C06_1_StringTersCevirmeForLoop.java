package day15_Overloading_forLoop;

import java.util.Scanner;

public class C06_1_StringTersCevirmeForLoop {// input olarak verilen stringi terse cevirip yazdiran bir method olusturun
    //kullanicidan bir kelime isteyin
    // bir onceki sorunun aynisi
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String input= scan.nextLine();

        terstenYazdirma(input);


    }

    public static void terstenYazdirma(String input) {
        String tersInput=input.substring(input.length()-1); // son harf
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput +=input.substring(i,i+1);

        }
        System.out.println(input+ " kelimesinin tersten yazilisi :"+" "+tersInput);
    }
}
