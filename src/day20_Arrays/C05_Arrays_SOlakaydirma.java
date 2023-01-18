package day20_Arrays;

import java.util.Arrays;

public class C05_Arrays_SOlakaydirma {// VERILEN 3 ELEMANLI BIR ARRAY'in
    //tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
    //ornek;array[1,2,3] ise output [2,3,1] olacak
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};// burayi degistirebiliriz
        int temps=arr[0];// son degri buraya atamak icin
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];// ornegin 2'yi 1'e , 3'u 2'ye , 4'u 3'e atasin ...
        }//loop bittikten sonra ;
        arr[arr.length-1]=temps;// her defasinda 0'inci indeksi(yani 1 'i) yani temp'i arr'ye son indekse  ata
        System.out.println(Arrays.toString(arr));

        //yukarida degistirdigimiz arrayi ilk duruma getirmek icin saga kaydiralim
           temps=arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i - 1];
        }
            arr[0]=temps;
            System.out.println(Arrays.toString(arr));

        }

        }




