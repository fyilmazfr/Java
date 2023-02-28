package day45_Collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionDataTuru {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        //liste.add(5);
        //liste.add('s');
        //liste.add("ali");

        List<Object> list=new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("ali");

        System.out.println(list);//[5, s, true, ali]

       list.set(0,(Integer)list.get(0)+5);//[10, s, true, ali]
/*
Colelctions <dataturu> nu object secmemiz durumunda Collection'a farkli data turlerinden objeler koymaniza izin verir
bu depolama acisindan bize esneklik saglar ancak islem yaparken tum objeleri object olarak tanimladigimizdan cok fazla
casting yapmamiz gerekebilir

 */

    }
}
