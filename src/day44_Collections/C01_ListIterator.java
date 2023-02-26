package day44_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {/*
    bir listede ki istenen sayi araliginda olmayan elementleri silen bir program yaziniz
    orn;[2,13,56,23,45,14,40] istenen aralik ile 20 ile 40 arasi (sinirlar dahil)
    output:[23,40]
     */
    public static void main(String[] args) {


        List<Integer> liste=new ArrayList<>();//ararylerden bir liste olsuturduk, ici integer olan ve import yaptik
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);//[2,13,56,23,45,14,40]
        ListIterator li1=liste.listIterator();
        int bassinir=20;
        int bitSinir=40;

        while (li1.hasNext()){//bir while loop olusturduk ve yaninda eleman oldugu muddetce loop calisacak
            Integer temp=(Integer) li1.next();//casting yaptik

            if (temp<bassinir || temp>bitSinir){
                li1.remove();//sil
            }

    }
        System.out.println(liste);//[23, 40]



}}
