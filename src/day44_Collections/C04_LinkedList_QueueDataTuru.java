package day44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList<>();

        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        /*QUEUE kuyruk demektir,sira onemlidir, gelen sona gelir giden bastan gider
        ve bazi yeni ozellikler var
         */
        System.out.println(ll3);//[adem, zeynep, Hpolat, Kadir]
        System.out.println(ll3.remove());//adem
        System.out.println(ll3);//[zeynep, Hpolat, Kadir]
        //remove methodu qu' da digerleri gibi calismiyor orn 18. satirda ilk sirayi yok etti ve bize silineni getirdi
       // ardindan da adem'siz bir liste olusturdu, sira kuyrugu gibi dusunelim

        System.out.println(ll3.remove("Hpolat"));//true
        System.out.println(ll3);//[zeynep, Kadir]

        System.out.println(ll3.element());//zeynep
        System.out.println(ll3.peek());//zeynep
        //suanda basta kim var diye bize getiriyor ama silmiyor.
        //benzeri olan peek methodu ise eger queue bos ise bir tanesi exception firlatiyor digeri bunu yapmiyor
        //bunu asagida bos bir liste de deneyelim
        Queue<String> ll4=new LinkedList<>();
        //System.out.println(ll4.element());//goruldugu gibi throws exception firlatti,kodumuzu yoruma alalim
        System.out.println(ll4.peek());//null DONDURUDU

        ll3.offer("ahmet");
        ll3.offer("sefa");
        System.out.println(ll3);//[zeynep, Kadir, ahmet, sefa]

        System.out.println(ll3.poll());//bastakini hem siliyor hemde bana getiriyor, zeynep
        //System.out.println(ll4.remove());Exceptions
        System.out.println(ll4.poll());//null



    }
}
