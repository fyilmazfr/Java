package day36_InheritancedaDateTypeKullanimi;

public class DIsci extends BMuhasabe{
    protected int saatucret=11;
    protected int gunlukmesaai=7;

    protected void maasIsci(){
        System.out.println("ISCILER:"+(30*saatucreti*gunlukmesaai)+"maas alir");
    }
    protected void ozelsigortaIsci(){
        System.out.println("ISCILER %70 indirimli ozel sigorta yapilabilir");
    }

    public static void main(String[] args) {
        BMuhasabe isc1=new DIsci();
        /* bir obje olusturulurken Data turu ve constructor ayni class'dan ise direk o class'a gidiyorduk
        Eger data turu ve constructor farkli ise?
        Obje constructor'in oldugu class'in objesidir ancak,bizden istenen Isci class'indaki spesifik ozellikler
        degil Bir iscinin muhasebe class'indaki tum calisanlarla beraber sahip oldugu genel ozellikleri yazdirir


         */
        System.out.println(isc1.gunlukMesai);//muhasebe 8
        System.out.println(isc1.saatucreti);//M 10
        isc1.maas();//M
        isc1.ozelsigorta();//M
        isc1.sigorta();//P
        System.out.println(isc1.isim);//P
        System.out.println(isc1.soyisim);//P
        System.out.println(isc1.departman);//P
    }
}
