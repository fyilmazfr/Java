package day03;

import java.util.Scanner;

public class C08_Scanner { // KULLANICIDAN ISMINI ALIP ILK HARFINI BUYUK HARF OLARAK YAZDIRIN }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkharf =scan.next().toUpperCase().charAt(0);
        System.out.println("ilkharf = " + ilkharf);
        

    }}
