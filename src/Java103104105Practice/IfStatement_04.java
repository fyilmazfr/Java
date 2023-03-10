package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_04 {
    /*
    soru:kullanicidan iki sayi isteyin
    sayilarin ikiside pozitif ise "sayilarin toplamini "yazdirin
    sayilarin ikiside negatif ise "sayilarin carpimini yazdirin"
    sayilarin ikiside farkli isaretlere sahipse "farkli isaretli sayilarla islem yapamazsin" yazdirin
    sayilardan 0 'a esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi1'i girin");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen sayi2'yi girin");
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("sayilarin toplami ;"+ (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("sayilarin carpimi ;"+(sayi1*sayi2));
        }else if (sayi1<0 && sayi2>0){
            System.out.println("farkli isaretli sayilarla islem yapamazsin ;");
        }else if (sayi1==0 ||sayi2==0)
            System.out.println("sifir carpmaya gore yutan elemandir");
    }
}

