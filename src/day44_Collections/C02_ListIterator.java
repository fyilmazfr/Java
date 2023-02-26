package day44_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {/*
BIR LISTEDEKI elementleri iterator kullanarak sondan basa dogru yazdirin
*/

    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        //sondan basa glebilmek icin once sona gitmek lazim
        ListIterator li1=liste.listIterator();//listIterator olusturduk
        System.out.println(liste);
        while (li1.hasNext()){//bir sonrakinde element olana kadaar devam et
            li1.next();
        }
        //bu loop bizi sona goturur
        while (li1.hasPrevious()){

            System.out.print(li1.previous()+" ");//40 14 45 23 56 13 2
        }

    }

}
