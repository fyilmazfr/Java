package Java103104105Practice;

import java.util.Scanner;

public class StringManipulation_replace {
    /*
    metin icerisinde karakter yada karakterlerin istenilen karakter yada metinle degistirilmesini saglar
    sonuc stringdir

    replacefirst; gordugu ilk karakteri degistirir

     \\d  tum rakamlar
     \\D rakam disi tum karakterler

     \\w  tum buyuk ve kucuk harf ve rakamlar
     \\W     tum buyuk ve kucuk harf ve rakamlar disindaki hersey

     \\s    (space) tum bosluklar
     \\S    (space) disindaki hersey
     */
    public static void main(String[] args) {
       String str1="$45.99";
       // rakam haricindeki hersyi silin
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1);//4599
        
        //verilen cumleyi * ile gizleyin, 10 karakterden sonra yazdirin
        String str2="java her derde deva";
        str2=str2.substring(0,10).replaceAll("\\w","*")+str2.substring(10);
        System.out.println("str2 = " + str2);//**** *** *erde deva

        //a harfini @ isareti ile degistir
        String str3="java her derde deva";
        str3=str3.replaceAll("a","@");
        System.out.println("str3 = " + str3);//j@v@ her derde dev@
        
        //replacefirst
        String str4="java her derde deva";
        str4=str4.replaceFirst("a","x");
        System.out.println("str4 = " + str4);//jxva her derde deva

        // bir dizi kumesini degistirme kalem yerine biber yazdirin
        String str="Dolma Kalem";
        System.out.println(str.replaceAll("Kalem","Biber"));//Dolma Biber



    }




}
