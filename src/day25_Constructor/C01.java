package day25_Constructor;

public class C01 {/*
* java OOP konsept kullanildigi icin olusturulan herbir class'in ihtiyac oldugunda object uretebilmesine uygun
dizayn etmistir
*Ama her class'dan obje uretilmeyebilir bunun icin java ihtiyac halinde kullanilmasi icin her class'da default bir constructor
koymustur ornek --->>>stepne teker ornegini verdik vardir ama gorunurde yoktur
* bu default constructor class'dan object olusturuldugunda otomatik olarak calisir
ornegin bu class'da constructor gorunmemesine ragmen C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
*/
    int sayi;
    public  void deneme(){
        System.out.println("C01'den deneme method calistirdik");
    }
}
