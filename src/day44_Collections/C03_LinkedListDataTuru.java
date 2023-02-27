package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedListDataTuru {
    public static void main(String[] args) {


    LinkedList<String> ll1=new LinkedList<>();//linkedlist'in kendisinden bir obje olustururuz.
    List<String> ll2=new LinkedList<>();//data turu olarak list'i sectik ki butun methodlari alabilelim,yani parent class olarak da secmis olduk
    Queue<String> ll3=new LinkedList<>();//yukardaki ayni seyi yaptik
    Deque<String> ll4=new LinkedList<>();

    //simdi sirasiyla tum ozelliklere bakalim.zaten gecmiste bildigimiz ozellikler;
    ll2.add("berk");
    ll2.add("done");
    ll2.add("enes");
    ll2.add("ayse");
    System.out.println(ll2);//[berk, done, enes, ayse]
    System.out.println(ll2.remove(3));//ayse
    System.out.println(ll2.remove("kemal"));//false
        /*
        24 ve 25. satirlar;Gordugumuz gibi ayni metod isim var yani remove.birincisinde o index'deki elementi siler
        ve sildigini bize yazdirir yani ayse'yi.
        ikincisinde ise biz bir sobje ismi girdik fakat listede olup olmadigini bilmiyoruz.listede olmadigi icin bize
         false dondurdu;eger listede olan bir ismi yazsaydik true dondurecekti.
         */
    System.out.println("ll2.isEmpty() = " + ll2.isEmpty());//false dondurdu, bos mu diye sorduk
    ll2.set(1,"serap");
    System.out.println(ll2);//DONE gitti serap geldi ,[berk, serap, enes]


    ll1.add("berk");
    ll1.add("ismail");
    System.out.println(ll1);//[berk, ismail]
    ll2.retainAll(ll1);//ll2'deki tum elementleri ll1 ile karsilastirir ll1'de olmayanlari siler
    System.out.println(ll2);//[berk]

    System.out.println(ll2.hashCode());//3020251


}
}


