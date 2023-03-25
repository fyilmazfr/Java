package Java103104105Practice;

import java.util.Scanner;

public class ForLoop7 {
    /*
    girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz
    bosluk VEYA a geldiginde bunlari yazmasin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();
       //String str1=str.replaceAll(" ","");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)==' ')
                continue;//ATLA

                System.out.println(str.charAt(i));
            }


            }

        }


