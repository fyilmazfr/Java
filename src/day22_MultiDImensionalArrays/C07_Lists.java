package day22_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class  C07_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();//list primitive data turlerini kabul etmez bu yuzden buyuk harfler
        //ile yazdik, alt enter ile import yaptik yoksa altini kirmizi cizer

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);//[5, 3, 7] java her ekleneni sona ekler

        // peki sona eklemek istemiyorsak?
        sayilar.add(2,10);//ikinci index'e 10 elementini ekle dedik, burda dikkat edelim java ekler
        //"add" ile ,update yapmaz, yani 3'den sonra 10'u ekler
        System.out.println(sayilar);// [5, 3, 10, 7] yapti.

    }
}
