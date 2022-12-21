package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C10_split {//split () bir array degil methodu degil,String methodudur
    //ama array dondurdugu icin bu konuda anlatiyoruz
    public static void main(String[] args) {
        String str="java ne kadar guzel";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[java, ne, kadar, guzel] , java space'leri bulur ve yerine
        // virgul bosluk koyar

        String[] kelimelerNe=str.split(" ne");
        System.out.println(Arrays.toString(kelimelerNe));//java "ne" 'yi bulur ve onu yok eder,[java,  kadar guzel] oldu


        // "java ne. kadar guzel;" bunu yazdiralim
        String[] karakterler=str.split("");//hiclik ile boluyoruz
        System.out.println(Arrays.toString(karakterler));
        // [j, a, v, a, .,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, ;]
        //yok etmeden boluyoruz

        //split ile herhangi bir Stringi istedigimiz sekilde parcalara bolup bir array haline getiriyoruz


    }

}
