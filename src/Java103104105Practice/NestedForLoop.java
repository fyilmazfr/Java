package Java103104105Practice;

import java.util.Scanner;

public class NestedForLoop {
    /*
    bir agac cizelim ust kisim ^
    alt kisim /// seklinde olsun
    GOVDE SABIT 5 olsun en az
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen agacin tac uzunlugunu giriniz");
        int tacUzunluk= scan.nextInt();

        String yaprak="";
        for (int i = 0; i <tacUzunluk ; i++) {
            yaprak+="^";
            System.out.println(yaprak);//her defasinda bir alt satira gec

        }//govde
        for (int i = 0; i <6 ; i++) {
            System.out.println("|||");

        }

    }}