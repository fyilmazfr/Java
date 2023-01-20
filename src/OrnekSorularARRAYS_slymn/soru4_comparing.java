package OrnekSorularARRAYS_slymn;

import java.util.Arrays;
import java.util.Comparator;

public class soru4_comparing {
    public static void main(String[] args) {
        //example 3; size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        // "java kolaydir calisana, ne kolay ki calismayana" ==>calismayana
        String sentence="java kolaydir calisana, ne kolay ki calismayana";
        System.out.println(sentence);

        sentence=sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        //sentence.split("");//bu method bize arrays verir bu yuzden bir arrays olusturmamiz gerekir
        String words[]=sentence.split(" ");// array haline getirdi

        Arrays.sort(words, Comparator.comparingInt(String::length));// JAVA, STRINGLERIN UZUNLUGUNA GORE KARSILASTIRMA YAP

        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);//java zaten siraladi ve en uzun kelime en sona koydu ,bizde bunu yazdirdik
    }
    }

