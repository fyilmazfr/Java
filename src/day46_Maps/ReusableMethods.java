package day46_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){//map donen(return) yeni bir method oludturduk

        Map<Integer,String> sinifMap=new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha,Emre,JDev");
        sinifMap.put(104,"Derya, Deniz, Tester");

        return sinifMap;


    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each:ogrenciMap.values()) {
            System.out.println(sira+"- "+each);
            sira++;

        }
    }

    public static List<String> isimSoyisimListeOlustur(Map<Integer, String> ogrenciMap) {
        List<String>methoddakiList=new ArrayList<>();
        String[] eachArr;

        for (String each:ogrenciMap.values()) {
            eachArr=each.split( ",");
            methoddakiList.add(eachArr[0]+" "+eachArr[1]);

        }
        return methoddakiList;
    }
}
