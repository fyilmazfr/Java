package day43_Iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.print(liste);//[10, 20, 30]
        //liste'deki tum elementleri index kullanmadan 3 artirin.
       // for (Integer each:liste) {
         //   System.out.print(each+3+" ");//13 23 33
/* java index yapisi olmayan collection'lardaki elementlere ulasmak veya degistirmek icin Iterator interface'ini
olusturmustur.
Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.Bunun yerine bize iterator donduren
liste.listIterator() methodunu kullaniyoruz
 */
            System.out.print(liste);
            Iterator it1=liste.listIterator();
            System.out.println(it1.next());//10
            System.out.println(it1.next());//20
            System.out.println(it1.next());//30
            //System.out.println(it1.next());//ARTIK BIR SONRAKI OLMADIGI icin java rte verir.
            //iterator'da geri donus yok . adim adim sona ulastiktan sonra basa gelmek isterseniz yeniden bir iterator
            //olusturmaniz gerekir
            //bu durumda yeni bir iterator olusturmaliyim
            Iterator it2=liste.listIterator();//[10, 20, 30]
            //yeni it2'yi kullanarak listenin tum elementlerini silelim.
            it2.next();
            it2.remove();
            it2.next();
            it2.remove();
            it2.next();
            it2.remove();//iterator ile elementleri gezip, remove yapinca liste kalici olarak degisti
            System.out.println(liste);//[]



            liste.add(10);
            liste.add(20);
            liste.add(30);
            System.out.println("yeniden liste" + liste);
            Iterator it3=liste.listIterator();
            while (it3.hasNext()){//yan tarafinda elemente sahipmi? varsa yana gec
                it3.next();
                it3.remove();
            }
            System.out.println("LOOP DAN SONRA yeniden liste" + liste);//[]
        /*goruldugu gibi iterator kullanarak yapabildigim ;
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
          buda bize yetmez


         */







        }

    }

