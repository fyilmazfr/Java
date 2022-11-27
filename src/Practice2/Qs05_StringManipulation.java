package Practice2;

import java.util.Scanner;

public class Qs05_StringManipulation { // GIIRLEN STRING ICINDE xyz VAR ISE TURE degilse FALSE yAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime (str)giriniz");
        String str= scan.nextLine();


        if (str.contains("xyz") || str.contains("XYZ")) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
