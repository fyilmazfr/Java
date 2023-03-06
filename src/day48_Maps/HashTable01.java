package day48_Maps;

import java.util.Hashtable;

public class HashTable01 {/*
1. Hash Table bir map'dir.
2.HashTable EntrySet'leri herhangi bir siralamaya tabi tutmaz
3.hasTable HashMap'lerden daha yavastir. cunku HashTable'lar thread-safe ve synchronized'dir.
   thread-safe;Ayni anda birden fazla is yapabilme becerisidir. yani corba piserken salatayi yapabiliyorsunuz, boylelikle
zamandan tasarruf edebiliyorsunuz.
   synchronized; coklu islevin zaman kazandiracak sekilde siralanabilmesidir.zamandan kazanabilmek icin once corbayi
 ardindan da salatayi yapmak gerekir.Tersini yaptigimiz taktirde zamandan kaybederiz.
 Coklu islerde hasTable daha hizlidir.
4.HasTable'larda Key null olamaz.NullPointerException atar.
5.HasTable'larda VALUE null olamaz.NullPointerException atar
(3,4,5. maddeler hashTable ve hashMap'lerin ayni zamanda farklaridir.interwiev sorusudur)
Note; toString() method'u objeleri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur
toString() method'unu olusturmadan konsola yazdirirsaniz Java o objenin adresini yazdirir
*/

    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations=new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println(countryPopulations);
        //countryPopulations.put(null,90000000);//HasTable'larda Key null olamaz.NullPointerException atar.
        //countryPopulations.put("France",null);//HasTable'larda VALUE null olamaz.NullPointerException atar
Hashtable<String,Students> myStudents=new Hashtable<>();
myStudents.put("Fransizca",new Students("Fatih Yilmaz","fy@hotmail.com",35,true));
        System.out.println(myStudents);
//{Fransizca=Students[name=Fatih Yilmaz', email=fy@hotmail.com', age=35, success=true]}

        //sirasiyla istedigimiz bilgileri javadan isteyelim
        String name =myStudents.get("Fransizca").name;
        System.out.println(name);//Fatih Yilmaz

        int age=myStudents.get("Fransizca").age;
        System.out.println(age);//35



    }
}
