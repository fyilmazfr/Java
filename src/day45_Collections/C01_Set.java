package day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {/*
verilen bir araydaki tekrar eden elementleri silip tekrarsiz halini array'e atayan kod yaziniz
*/

    public static void main(String[] args) {
        int[] arr ={4,5,6,4,8,4,9,4,0,5,8,1,2,3,4,5,6,6,7,8,7,6,5,4,1};
        Set<Integer> tekrarsizSet=new HashSet<>();// bir set olusturduk hashset'lerden
        //arraydeki tum elemanlari set' e atmamiz gerekir
        for (int each:arr) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] tekrarsiz set

        int[] tekrarsizArray=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArray));

        int i=0;
        for (Integer each:tekrarsizSet) {
            tekrarsizArray[i]=each;
            i++;

        }
        arr=tekrarsizArray;
        System.out.println(Arrays.toString(tekrarsizArray));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]ARRAY IN son hali

    }
}
