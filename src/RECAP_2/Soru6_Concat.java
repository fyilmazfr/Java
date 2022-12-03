package RECAP_2;

import java.util.Scanner;

public class Soru6_Concat {//scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim1=scan.nextLine();
        System.out.println("ikinci isim giriniz");
        String isim2=scan.nextLine();

        System.out.println(isim1.concat(" "+isim2));


    }

}
