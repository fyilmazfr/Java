package day12_StringManipulation;

import java.util.Scanner;

public class CS04_stringManipulation { // KULLANICIDAN 4 HARFLI BIR KELIME ISTEYIN VE KELIMEYI TESRTEN YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime girin");
        String kelime= scan.nextLine();


        System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));






    }
}
