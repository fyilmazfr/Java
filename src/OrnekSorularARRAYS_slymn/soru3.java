package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru3 {
    public static void main(String[] args) {
        //example: {0,2,3,0,12,0} 0'lari sona koyunuz
        int[] arr = {0, 2, 3, 0, 12, 0};
        int temps[] = new int[arr.length];//yeni arrays olusturduk
        int idx = 0;//index olusturduk burda
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temps[idx] = arr[i];
                idx++;


            }

        }
        System.out.println(Arrays.toString(temps));
    }
}
