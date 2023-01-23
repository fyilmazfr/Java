package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class Soru11 {//bir mda 'i normal array'e ceviren kodu yaziniz

    //{{2,5,1},{32,75}}  ==>>> {} hale getir.
    public static void main(String[] args) {
        int[][] arr = {{2, 5, 1}, {32, 75}};
        int toplam = 0;

        for (int[] w : arr) {
            toplam = toplam + w.length;//eleman sayisini hesapladik

        }
        int idx = 0;
        int[] brr = new int[toplam];
        for (int[] w : arr) {
            for (int k : w) {
                brr[idx] = k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(brr));


    }
}

