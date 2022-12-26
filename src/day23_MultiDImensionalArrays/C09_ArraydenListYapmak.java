package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_ArraydenListYapmak  {
    public static void main(String[] args) {
        /* List ile calisirken en kotu ozelligi elemanlari tek tek eklemek
      */
        int []arr={2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        //bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
        //array olusturup ,forLoop ILe olusturdugumuz list'e tasiyabiliriz

        List<Integer> sayilar =new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);//
        }
        System.out.println(sayilar);//[2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        }
    }
    //burda hoca Array.asList ' i anlatti fakat cok hata verdiginden bahsetti ,sonra bakilabilir

