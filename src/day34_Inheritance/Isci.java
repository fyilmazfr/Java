package day34_Inheritance;

public class Isci extends Personel{
    /*normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    java'da ise child class'lar ozelliklerini Inherit etmek istedikleri class'i kendilerine parent edinirler

    mesela isci class'inin olusturunca nelere ihtiyaci var diye dusunsek personel class'inda ki tum variable ve
   methodlara ihtiyaci oldugunu gorebiliriz
   bu durumda yeniden o variable ve methodlari olusturmak yerine perdonel class'i kendimize
   parent ediniriz.
   BIr claas'i parent edinmek icin extends keywords kullanmaliyiz
     */
    int persNo=1001;

    public static void main(String[] args) {
        Isci  isci1=new Isci();//isci class'ina ozel bir method urettik
        System.out.println(isci1.isim);//isim belirtilmedi
        isci1.isim="selim";//isciye bir isim atadik
        System.out.println(isci1.persNo);//1001 yazar,persNOyu bu class'dan alir cunku yukarda numarayi atadik

        isci1.maas();//maas methodu yok gidip personel den alip getirir

    }//eger isci classinin kendine ozgu bir maasi olmasini istersek ne yapariz?
    //isci ye ozel maas methodu olusturmamiz gerekir
    public  void maas(){//maas ismi ayni olmali yoksa isler karisir
        System.out.println("isciler minumum 15 euro saat ucreti alir");//artik yazdirirsak mmas kismina bu bolum gozukur
        //cunku bir onceki isci1.maas parent class'dan gelmisti
    }
    public  void ozelSigorta(){//ornegin personelin genelinde olmayip iscilere ozel bir uygulama yapmak istedik ozel sigorta
        System.out.println("iscilere isteyene %50 indiriml ozel sigorta yaptitilir");
    }
}/* BIR CLASS BASKA BIR CLASS'I PARENT EDINDIGINDE
1.parent class'daki tum ozelliklere (variable+method) otomatik sahip olur
2.PARENT CLASS4DAKI OZELLIKLERDEN BAZILARINI KENDILERINE UYARLAYABILIR
3.parent class'da olmayan bazi yeni ozellikler olusturabilir
not; parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
*/
