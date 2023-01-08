package Practice6;

import java.util.Arrays;

public class Q07_Arrays {/*verilen arrayde toplamlari istenen degere esit olan sayi ciftlerini yazdiran
    bir method yaziniz , asagida istenen toplam deger 9 olsun.*/

    public static void main(String[] args) {
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;
        arrMethod(arr, istenenToplam);
    }

        public static void arrMethod(int[] arr, int istenenToplam) {


        for (int i = 0; i < arr.length ; i++) {
            for (int j =0; j < arr.length ; j++) {

                if (arr[i]+arr[j]==istenenToplam){

                    System.out.println(arr[i]+"ve"+arr[j]+"toplam:"+istenenToplam);
                }

            }

        }

    }


    }

