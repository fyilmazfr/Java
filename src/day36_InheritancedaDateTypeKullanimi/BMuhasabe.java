package day36_InheritancedaDateTypeKullanimi;

public class BMuhasabe extends APersonel{
    protected  int saatucreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("personel minumum:"+ (30*gunlukMesai*saatucreti)+"maas alir");
    }
    protected void ozelsigorta(){
        System.out.println("isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }
}
