package OrnekSorularARRAYS_slymn;

import java.util.Arrays;
import java.util.Scanner;

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

        //EXAMPLE 2: bir array in icinde bir elemanin olup olmadigini kontrol eden ,ve kac kere tekrarlandigini
        // gosteren kodu yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi belirtiniz ve yanit bekleyiniz");
        int sayi = scan.nextInt();
        int sayac = 0;


        int[] xrr = {0, 2, 3, 0, 12, 0, 4, 8, 8, 8, 0, 0};
        for (int i = 0; i < xrr.length; i++) {
            if (xrr[i] == sayi) {
                sayac++;
            }

        }
        System.out.println("girilen sayi " + sayac + " " + " kez kullanilmistir");
    }
}
