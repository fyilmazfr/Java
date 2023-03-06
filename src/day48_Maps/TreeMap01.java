package day48_Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    1. TreeMap'ler entrySetleri keylere gore "natural order" da siralar ve cok emek ister
    2.TreeMap'ler en yavas Mapler'dir
    3.TreeMap'ler thread-safe ve syncronized degildir
     */
    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimy Jones", 5000.00);
        salaries.put("Kevin", 6000.00);
        System.out.println(salaries);//Alfabetik siralama yapti
        //{Jimy Jones=5000.0, Kevin=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}


        SortedMap<String, Double> map1 = salaries.tailMap("Kevin");
        System.out.println(map1);//{Kevin=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String, Double> map2 = salaries.tailMap("Kevin", false);
        System.out.println(map2);//{Mary Star=1000.0, Tom Hanks=3000.0}
        //Tail kuyruk demektir, map1 de kevin dahil , map2de kevin'siz yazdirdi


        NavigableMap<String, Double> map3 = salaries.subMap("Kevin", true, "Tom Hanks", false);
        System.out.println(map3);//{Kevin=6000.0, Mary Star=1000.0}

        //lowerEntry BIR ONCEKINI VERIR
        Map.Entry<String, Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);//Kevin

        //PARIS HILTON OLMASADA SANKI VARMIS GIBI DAVRANIR VE ONCESINI VERIR
        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Mary Star=1000.0

        //salaries.higherEntry()
        //salaries.floorEntry()
        //salaries.ceilingEntry()


    }
}
