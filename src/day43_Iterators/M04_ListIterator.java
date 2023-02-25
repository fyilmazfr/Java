package day43_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
        Integer temp;
        ListIterator lit1=liste.listIterator();
        while (lit1.hasNext()){
            temp=(Integer)lit1.next()+3;//casting yaptik PARANTEZ ICINDE

            lit1.set(temp);

        }
        System.out.println(liste);//[13, 23, 33]



    /*
    ListIterator Iterator interface'inin child interface'dir
    ama daha cok method'a sahiptir
     */





}

}