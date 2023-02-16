package day34_Inheritance;

public class Personel {
    /* EGER PARENT CLASS olarak tasarladiginiz bir class varsa
    veya ilerde bu cllass'i parent yapmak isteyenler olabilir diyorsaniz
    ozaman variable ve methodlarin access modifier'ini protected yapmalisiniz
    bylece sadece child olan class'lar sizden istifade ederken,
    child olmayanlar sizin variable ve methodlariniza ulasamaz.
    not;JAVA PROTECTED'I INHERITANCE ICIN YAPMISTIR
    en basta public olan variablelari  bizde hepsini degistirelim protected yapalim
     */

   protected int persNo;
    protected String isim="isim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected  void maas(){
        System.out.println("Tum personelin maasi vardir");
    }
   protected  void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }
    protected  void fazlamesaiucreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");

    }
}
