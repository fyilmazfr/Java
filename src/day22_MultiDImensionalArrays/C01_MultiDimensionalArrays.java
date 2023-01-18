package day22_MultiDImensionalArrays;

import java.util.Arrays;

public class  C01_MultiDimensionalArrays {/*tek katli arrayler'de array'i yazdiramiyoruz.cunku array non primitive data
turudur ve her nonprimitive data direk yazdirilamayabilir ANCAK array'in icerisindeki elementleri direk yazdirabiliyorduk
cunku genelde primitive data turu veya String elementler kullaniyorduk.
MDA'daen dikkat edecegimiz konu ulasmak istedigimiz elementin bir array mi yoksa primitive data mi oldugudur.*/

    public static void main(String[] args) {
        int[][] sayilar={{1,2,4,5},{3,4}};//burda asayilar  array'ini dusunursek icinde 2 tane inner array var
        //sayilar [0] == 1,2,4,5 ,  0.index
        System.out.println(sayilar[0]);//[I@7c75222b referans verir
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5] 0.inner arrayi yazdirdik

        //fakat en icerdeki elementlere ulasirsak direk yazdirabiliriz:
        System.out.println(sayilar[0][1]);//0. inner array'in 1. INDEXINDEKI elementi,2 Yazdirir
        System.out.println(sayilar[1][0]);// 1.inner array'in 0. indexi,3 yazdirir

        // ve multi dimensionel arrayin hepsini yazdirmak icin ne yapariz?
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]] deep.toString yaparak tumunu yazdirdik

        /*array'i iki sekilde deklare edebiliriz
        1- elemanlari direk yazabiliriz
        int[][] sayilar ={{1,2,4,5},{3,4}}
        2-outer ve inner arraylerin uzunluklarini belirterek olusturabiliriz
        int[][] sayilar =new int [3][4];
         */
    }

}
