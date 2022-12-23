package day22_MultiDImensionalArrays;

import java.util.Arrays;

public class C04_MDAistenenArrayiOlusturma {/*asagicaki multi dimensional arrayin ic arraylerindeki
tum arraylerin toplamini birer birer bulan ve herbir sonucu yeni bir array in elemani yapan
    ve yeni arrayi ekrana yazdiran bir program yaziniz
    {{1,2,3},{4,5},{6,7}}
    */


    public static void main(String[] args) {
        int [][] input={{1,2,3},{4,5},{6,7}};
        int[] yeniArr=new int[input.length];// ic loop un uzunlugu yeni arr'e atadik
        int toplam=0;

        for (int i = 0; i <input.length ; i++) {//dis loop outer array'i kontrol ediyor
            for (int j = 0; j <input[i].length ; j++) {//ic loop ise inner array'in kontrol eder
                toplam+=input[i][j];

            }
            yeniArr[i]=toplam;// ustte toplami for loop bitince yeni arr'in i.elementine ekledim
            toplam=0;//en son toplami tekrar 0'a esitledik

        }
        System.out.println("istenen yeni array:"+" "+ Arrays.toString(yeniArr));
        //istenen yeni array: [6, 9, 13] yazdirdik


    }
}
