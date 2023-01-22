package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru_mda_02 {//bir string mda 'da  icinde "a" olan elemanlari concole'a yazdiririniz

    public static void main(String[] args) {
        String arr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].contains("a")) {

                    System.out.print(arr[i][j] + ",");
                }
            }
        } System.out.println();

        //yada
        for (String[] w : arr) {
            for (String k : w) {
                if (k.contains("a")) {
                    System.out.print(k + ",");


                }

            }
        }}}


