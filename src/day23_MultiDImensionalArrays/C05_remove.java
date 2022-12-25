package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);
        System.out.println(sayilar1);//[5, 3, 2, 1]
        sayilar1.remove(1);//ONEMLI aciklama; sayilardan olusan bir list varsa java remove method'unda
        //sayi yazdigimizda direk index olarak kabul eder, ve yazdiralim asagiya
        System.out.println(sayilar1);//[5, 2, 1] ,,,,,3'u sildi

        //ama biz 5'i silmek istiyorsak?
        Integer sil=5;//5'i integer olarak tanimladik ve isminide sil koyduk ve sonra;
       sayilar1.remove(sil);
        System.out.println(sayilar1);//[2, 1] 5 objesini sildi ve yeni liste

        //baska bir yontem, indexof methodu ile;
        sayilar1.remove(sayilar1.indexOf(2));//2'yi silmek icin 2'nin index'ini bulup onu remove'a yazabiliriz
        System.out.println(sayilar1);//[1] yeni liste
    }
}
