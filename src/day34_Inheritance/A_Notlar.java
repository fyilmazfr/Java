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

    * Eger bir class da extends varsa tum constructorlarin ilk satirinda super(); constructor call vardir
      Extends keyword kullanilan classlarda ister default constructor bulunsun istersek de biz yeni constructor(lar)
      olusturulaim Java constructor'in ilk satirina super(); constructor call yazar
      super(); cons call default cons 'a benzer , gorunmese de orada vardir ve calisir ancak biz ilk satira farkli bir
      cons call yazarsak Java super(); cons'ini siler.

      Eger biz mudahale edip kendi constructor call'umuzu olusturmassak Java'nin default olarak olusturdugu
      constructor call her zaman parametresizdir
      super();

    * this() constructor call, icinde bulunulan class'daki constructorlari,
          super() cons call ise parent class'da bulunan constructorlari cagirir

        this() veya super() parametre yapisina uygun bir constructor bulamazsa? Java CTE verir.
          construtor konusunda gormedigimiz this. o class'daki instance variable'lari refere ediyordu
          Inheritence da da super. vardir ve parent class'daki instance'lari refere eder.

    *Bir constructor calistirdigimizda once parent class'daki constructor calisir.cunku her constructor'un
     ilk satirinda super() keyword vardir(gorunmese bile)

    *super() vethis() constructor cagirmak icin kullanilirlar ve constructo'in ilk satirinda olmalidirlar.Bu durumda
      bir constructor'da ikisinin birden olmasi mumkun degildir
     super. ve this. variable cagirmak icin kullanilirlar.ilk satirda olma sarti olmadi gi icin ikisi birlikte kullanila
      bilirler.

    *constructor calismasi bittginde atanan degerler eski degerlerine doner.
    * Hangi access modifier'lar inherit edilebilirler?
        CEVAP; Public ve protected olanlar heryerden, defaul olanlar ayni paketten inherit edilebilir.
    * super. direk parent class'a gittigi icin eger orda aradigini bulamazsa yani atanan bir deger yoksa CTE verir.Cunku
       parent class'dan child class'a donmeyecegi icin.
    * super() ve this() bulunduklari constructor'da ilk sirada olmalidir.
    * super() ve this() bulunduklari constructor'da AYNI AYNA kullanilamazlar.

                        Inheritance'da Date Type Kullanimi
    *  BMuhasabe mhsb1=new BMuhasabe();// muhasebe class'indan bir obje olusturduk
        her nekadar memur class'inin icinde olsak da olusturdugum obje muhasebe class'indan cunku data turu ve
        constructor BMuhasebe 'den.
        obje olusturdugumuz her class'da objeden once yazdigimiz(yani sol taraf) class ismi bir data turudur(BMuhasebe)


    * BMuhasabe isc1=new DIsci();
         Bir obje olusturulurken Data turu ve constructor ayni class'dan ise direk o class'a gidiyorduk
        Eger data turu ve constructor farkli ise?
        Obje constructor'in oldugu class'in objesidir ancak,bizden istenen Isci class'indaki spesifik ozellikler
        degil Bir iscinin muhasebe class'indaki tum calisanlarla beraber sahip oldugu genel ozellikleri yazdirir
    * EGER DATA turu olan class'da aradigimiz ozellik yoksa ,varsa onun parent'ina gidebilir ama child'a donus
        olmaz . Aradigi ozelligi bulamazsa CTE verir


                  OVERRIDING (Uzerine yazma,gecersiz kilma)

    *Child class'daki bir method'un parent class'daki methodu etkisiz kilarak kendisini spesifiklestirmesidir.
    * Child class'daki bir method'un parent class'daki methodu etkisiz kilarak kendisini spesifiklestirmesidir.
        Overriding'i nerede dikkate aliyoruz?
        Bir obje olusturulurken data turu ve constructor farkli ise
        Eger bir obje olusturulurken data turu ve constructor farkli ise objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz

        1-Obje constructor'in oldugu class'da olusur
        2-Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz,bu class'da aranan ozellik
        bulunamazsa parent class'lara bakilir,ordada bulamazsak CTE verir.
        3-Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        Aranan ozellik method ise degeri yazdirmadan once override edilmis mi diye kontrol etmemiz gerekir
        eger overrride edilmis ise en guncel degeri yazdiririz.
     *  @Override notasyonu Javaya bir gorev verir ,Java bu notasyonla birbirine bagli olan iki method'u surekli kontrol eder
         surekli kontrol eder
         Eger parent class'daki overridden method'u silerseniz java CTE verir
          kullanmak mecburi degildir eger overrriding method silinirse , kodun CTE vermesini istersek @Override
          notasyonu kullanmaliyiz

     * Overloading;;
      Bir class'da ayni isimde ve ayni signature'a sahip iki method olmaz,Ayni class'da ve isimde birden fazla method
        olusturmak istersek mutlaka signature'i degistirmeliyiz
        farkli class'larda ayni isme ve signature'a sahip iki method olabilir mi?








     */
}
