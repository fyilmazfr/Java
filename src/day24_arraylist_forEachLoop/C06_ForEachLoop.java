package day24_arraylist_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int []arr ={2,3,4,23,6,8,9,1};//arr adinda int bir array olusturduk
        List<Integer> liste=new ArrayList<>();//olusturulan bu array'i list yaptik
        //tum sayilari inceleyelim tek sayi olanlari list'e atayalim

        for (int each:arr //gelecek datalarin turu, loop icinde ne isim verdigim,nerden aldigim
                //arr arrayine git herbir integer'i al bana getir
             ) {
            if (each % 2 == 1) {//mod 2'si 1 e esit olan integeri each'den al ve liste'ye ekle
                liste.add(each);
            }

        }
        System.out.println(liste);//[3, 23, 9, 1]
    }
}
