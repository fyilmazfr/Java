package day48_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Map02 {/*
SIZE VERILEN BIR KELIME KULLANILAN HARFLERIN KACAR KERE KULLANILDIGINI GOSTEREN KODU YAZINIZ
abbcaa===>>> a=3 , b=2 , c=1

*/

    public static void main(String[] args) {
        String str="abbcaa";

        String[] strArr=str.split("");
        System.out.println(Arrays.toString(strArr));//[a, b, b, c, a, a]

        HashMap<String,Integer> gorunum=new HashMap<>();
        for (String w:strArr) {
            Integer gorunumSayisi=gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }

        }
        System.out.println(gorunum);//{a=3, b=2, c=1}
    }
}
