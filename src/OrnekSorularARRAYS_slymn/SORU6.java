package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class SORU6 {
    public static void main(String[] args) {
        // SIZE verilen pozitif ve negatif sayilar iceren bir integer arrays deki en buyuk negatif ve en kucuk pozitif elemani bulunuz
        int[] arr={-12,-18,23,-2,0};


        Arrays.sort(arr);
        int maxNegative=arr[0];
        int minPositife=arr[arr.length-1];

        for (int w:arr) {
            if (w<0){
                maxNegative=Math.max(maxNegative,w);
            }
            if (w>0){
                minPositife=Math.min(minPositife,w);
            }

        }
        System.out.println(maxNegative);
        System.out.println(minPositife);
    }
}
