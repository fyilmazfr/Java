package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        //iki sekilde arrays olusturabiliriz
        int sayilar[]={1,2,3};
        String harfler[]=new String[4];
        System.out.println("sayilar arrays'in uzunlugu:"+sayilar.length);//3
        //string length() methodunda parantez var, array'de yok
        System.out.println("harfler array'in uzunlugu:"+ harfler.length);//4
        System.out.println(Arrays.toString(harfler));// deger atamadigimiz icin java null degeri atar

        //harfler array'in son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);

        //peki uzunlugundan fazla harf yazarsak
        System.out.println(harfler[5]);// java problem gormez ama calistirirken exception verir

    }
}
