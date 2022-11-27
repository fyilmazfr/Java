package Practice2;

import java.util.Scanner;

public class Qs03_StringManipulation { // KULLANICIDAN BIR KELIME ISTEYIN EGER KELIME 3 VE DAHA FAZLA HARFDEN OLUSUYORSA
    //SON IKI HARFINI 3 KERE YAN YANA YAZDIRIN DEGIL ISE GIRILEN KELIMEYI YAZDIRIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.nextLine();

        if (str.length()>=3) {// burda substrin aliyoruz, dikkat substring itibaren aliyor ,yani length-1 yapmayiz
            System.out.println(str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2));


        } else {
                System.out.println(str);
            }
}}
