package day48_Maps;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    public static void main(String[] args) {
        /*
        Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
        "I like to move it,move it."
        map ile cozecegiz
         */
       String str= "I like to move it, move it.";
       str=str.replaceAll("\\p{Punct}","");//tum noktalama yi kaldirdik
        System.out.println(str);//I like to move itmove it

        //kelimeleri almak icin split() kullanalim
        String[] kelimeler=str.split(" ");//virgulle ayrilan kelimeleri kelimeler array'ine atadik
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, itmove, it]

        HashMap<String,Integer> gorunum=new HashMap<>();//bir hasmap olusturduk
        for (String w:kelimeler) {
            Integer gorunumSayisi=gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }

        }
        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}
    }
}
