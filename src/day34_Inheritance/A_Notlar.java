package day34_Inheritance;

public class A_Notlar {
    /* inheritance kavrami variable'lardan daha cok method'larla ilgilidir.
    * Normal hayatimizda parent cocuk sahibi olmaya karar verebilir  java'da ise child class'lar ozelliklerini
    Inherit etmek istedikleri class'i kendilerine parent edinirler
    * bir class'in icinde ornek bir method yazimi su sekilde olur;  public  void maas(){}
    * BIR CLASS BASKA BIR CLASS'I PARENT EDINDIGINDE
     1.parent class'daki tum ozelliklere (variable+method) otomatik sahip olur
     2.PARENT CLASS'DAKI OZELLIKLERDEN BAZILARINI KENDILERINE UYARLAYABILIR
     3.parent class'da olmayan bazi yeni ozellikler olusturabilir
      not; parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
    * Methodlar class'in icerisinde main methodun disarisinda olur.

    * EGER PARENT CLASS olarak tasarladiginiz bir class varsa
     veya ilerde bu cllass'i parent yapmak isteyenler olabilir diyorsaniz
     o zaman variable ve method'larin access modifier'ini protected yapmalisiniz
     boylece sadece child olan class'lar sizden istifade ederken,
     child olmayanlar baska package'dan  sizin variable ve methodlariniza ulasamaz.
    Not;JAVA PROTECTED'I INHERITANCE ICIN YAPMISTIR

    *Inheritance sayesinde yazilan bir cod'un tekrar tekrar kullanilabilmesi(reusability) mumkun olabilir.

    * Geneli kapsayan ozellikleri parent class'a ,spesifik ozellikleri ise child class'larda olusturulur.
    * Child classlar public ve protected data'lari problemsiz bir sekilde inherit edebilir.Fakat private data'lar
      inherit edilmez.
    * Default data'lar child ve parent ayni package'da olduklari zaman inherit edilebilirler.
    * Static methods veya variable'lar inherit edilemezler.
    * Parent class'in java'daki diger adi Super class dir.
    * Child class'in java'daki diger adi Sub class dir.
    * java bir child class'in bir parent class'i olur. yani SINGLE INHERITANCE kabul eder.
    * java inheritance zincirini kabul eder Multilevel inheritance denir.
    * Birden fazla class ayni class'i parent olarak kabul edebilir.


                     inheritance'de constructor kullanimi
    *Java'da baska bir class'a gidebilmek o class'i kullanabilmek icin o class'in constructor'unu kullanmak
     zorundasiniz.
    * Java'da bir class'i kullanabilmek icin o class'dan obje olusturur,dolayisiyla o class'in constructor'ini
        kullanirdik.
        java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur.
        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde Child cons.'ini
        kullaniriz.
        Java Child(){} gordugunde once parent'in constructor'ini calistirmam lazim der buradan parent cons.'a gider
        Parent class'inda Parent(){} gorunce once bunun parent'inin yani Grandparent cons. calismasi gerekir der
        Boylece extends keywords olmayan class'a kadar gider ve oradan baslayarak tum constructor'lari
        asagi dogru calistirir.




     */
}
