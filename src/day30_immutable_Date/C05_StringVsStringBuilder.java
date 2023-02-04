package day30_immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /* string mi yoksa stringBuilder mi daha hizlidir bunun icin bir string olusturup 1000 kere sonuna nokta
       ekleyelim oncesinde ve sonrasinda zamani alip aradki farki bulalim
        ayni sekilde stringBuilder icin de yapalim
         */


        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str+=".";


        }
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);//20:04:35.947940700
        System.out.println(bitis);//20:04:36.010417700

    }
}
