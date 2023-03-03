package day46_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha,Emre,JDev");
        sinifList.put(104,"Derya, Deniz, Tester");
        System.out.println(sinifList);

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Enes, Cem, Tester, Taha,Emre,JDev, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size());//4
        //tum ogrencilerin isim ve soyisimlerini SIRA NO ile alt alta yazdirin
        Collection<String> tumValueCollections =sinifList.values();//atama yaptik
        for (String each:tumValueCollections) {
            //buradaki EACH bize her bir ogrenciye ait ,ayni yapidaki isim,soyisim,brans bilgilerini iceren Stringler
            //getiriyor
            System.out.println(each);

        }//hoca sorunun cevabini uzatti. fakat bizim istedigimiz daha clear bir kod oldugu icin yeni ve guncel cozumu
        //diger classlarda gostermek istedi ordan devam et C02 ve reeusable class'lari actik


    }
}
