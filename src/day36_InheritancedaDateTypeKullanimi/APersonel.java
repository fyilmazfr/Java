package day36_InheritancedaDateTypeKullanimi;

public class APersonel {
    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String departman="departman belirtilmedi";

    protected  void maas(){
        System.out.println("tum personel maas alir");
    }
    protected void sigorta(){
        System.out.println("tum personelimize sigorta yapilir");
    }
}
