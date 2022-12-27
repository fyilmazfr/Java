package day24_arraylist_forEachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {/*soru;verilen bir array'deki tekrar eden elementleri yazdirin*/

    public static void main(String[] args) {
        int[] arr={2,3,6,3,5,5,5,4,1,9,6,3};
        Arrays.sort(arr);//int oldugu icin Arrays.sort methodu ile siraladik
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 9]

        List<Integer> tekrarEdenler=new ArrayList<>();
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){//eger arr bir sonrakine esitse ve bunlar
                //tekrar edenler listesinde yoksa yazdir
                System.out.print(arr[i]+" ");
              tekrarEdenler.add(arr[i]);//3 5 6

        }

    }
}}
