package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C01_Size_Set {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println("Listenin boyutu :"+sayilar1.size());//boyutunu olcelim, 3 yazdirdi
        //ornegin 2 elementi ekleyelim
        sayilar1.add(2);//2'yi ekledik ve asagida yazdiralim
        System.out.println(sayilar1);//[5, 3, 2, 2] ve yeni hali
        //ornegin tum sayilar1 array'ini ekleyelim
        sayilar1.addAll(sayilar1);//addall yaparak tumunu ekledik,ve yazdiralim
        System.out.println(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2] yazdirdi ve yeni hali
        System.out.println("listenin yeni boyutu:"+sayilar1.size());//listenin yeni boyutu:8 (8 elementli),,yazdirdi

        sayilar1.set(2,8);//set yaparak 2.index'i 8 yap dedik ve yazdiralim
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2] oldu yeni hali

        System.out.println(sayilar1.set(0,12));// 0.index'i 12 Yap dedik fakat bu sekilde set edersek sadece eski
        //elementi yazdirir yani 5'i
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2] //bu sekilde sout yapmamiz lazim
        /*eger eski elementi silmek istemiyorsak add(index,deger) methodunu kullaniyorduk, bu method
        biraz kenara kayin diyordu
        set sildigi eski elementi de bize dondurur.
         */
    }
}
