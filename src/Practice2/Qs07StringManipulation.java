package Practice2;

import java.util.Scanner;

public class Qs07StringManipulation {//KULLANICIDAN BIR KELIME GIRMESINI ISTEYIN
    //SOZCUKTE TEK SAYIDA KARAKTER VE 3 VEYA DAHA FAZLA KARAKTER ICERIYORSA
    // KELIMENIN ORTASINDAKI KARAKTERI YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str= scan.next();
        char ortancakarakter=str.charAt((str.length()-1)/2); // 25 KARAKTERLI BIR KELIMENIN INDEXI 0 SAN BASLAYACAGI ICIN -1 ve /2 DEDIK

        if (str.length()%2!=0   && str.length()>=3){
            System.out.println("ortanca karakter:"+ ortancakarakter);;
        }else {
            System.out.println("tebrikler sayiniz cift sayida karakter veya 3den az karakter");
        }
    }
}
