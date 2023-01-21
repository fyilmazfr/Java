package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru7_Arrays_switch {//BIR stringdeki sesli harflerin sayisini bulan kodu yaziniz
    //a e i o u  A  E I O U
    public static void main(String[] args) {
        String str = "java ogrenince PARA kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();

        String harfler[] = str.split("");// hiclikten bol dedik split ile ve bunu da array'e atadik
        int counter = 0;
        System.out.println(Arrays.toString(harfler));
        for (String w : harfler) {


            switch (w) {
                case "a":

                case "e":

                case "i":

                case "o":

                case "u":


                    counter++;

            }
        }
        System.out.println(counter);
    }}
