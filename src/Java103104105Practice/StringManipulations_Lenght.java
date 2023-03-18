package Java103104105Practice;

import java.util.Scanner;

public class StringManipulations_Lenght {
    public static void main(String[] args) {
        //length kelle sayar, bosluklarda karakterdir sayilir
        //havva length=5 index=4

        String cumle="Bugun hava yagmurlu";
        System.out.println(cumle.length());//19

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        //soru ; kullanicidan isim soyisim alin ve hangisi daha uzunsa onu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim girin");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisim girin");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden daha fazla karaktere sahiptir");
        }else if (isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle ayni sayida karaktere sahiptir");
        }else {
            System.out.println("soyisminiz daha fazla karaktere sahiptir");
        }
//soru kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan1=new Scanner(System.in);
        System.out.println("lutfen 4hafli bir kelime giriniz");
        String kelime=scan1.nextLine();

        if (kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("kelime length;" +dort+uc+iki+bir);
        }else {
            System.out.println("gecersiz kelime");
        }














    }
}
