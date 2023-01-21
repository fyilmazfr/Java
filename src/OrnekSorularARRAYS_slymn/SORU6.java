package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class SORU6 {
    public static void main(String[] args) {
        // SIZE verilen pozitif ve negatif sayilar iceren bir integer arrays deki en buyuk negatif ve en kucuk pozitif elemani bulunuz
        int[] arr={-12,18,23,-2,0};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxNegative=arr[0];
        int minPositife=arr[arr.length-1];

        for (int w:arr) {
            if (w<0){
                maxNegative=Math.max(maxNegative,w);//-2 yi bulmk icin
            }
            if (w>0){
                minPositife=Math.min(minPositife,w);//math.min ILE EN KUCUK  POSITIF'i bulduk
            }

        }
        System.out.println(maxNegative);
        System.out.println(minPositife);
    }
}
