package day36_InheritancedaDateTypeKullanimi;

public class CMemur extends BMuhasabe{
    protected int saatucreti=12;
     protected int gunlukmesaai=9;

   protected void maas(){
       System.out.println("memurlar:"+(30*saatucreti*gunlukmesaai)+"maas alir");
   }
   protected void ozelsigorta(){
       System.out.println("memurlar %60 indirimli ozel sigorta yapilabilir");
   }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukmesaai);//9
        System.out.println(mmr1.saatucreti);//12
        mmr1.maas();//memurlar:3240maas alir
        mmr1.ozelsigorta();//memurlar %60 indirimli ozel sigorta yapilabilir
        mmr1.sigorta();//PERSONEL
        System.out.println(mmr1.isim);//personel
        System.out.println(mmr1.soyisim);//p
        System.out.println(mmr1.departman);//p


        BMuhasabe mhsb1=new BMuhasabe();// muhasebe class'indan bir obje olusturduk
        //her nekadar memur class'inin icinde olsam da olusturdugum muhasebe class'indan cunku data turu ve constructor
        //BMuhasebe

        System.out.println(mhsb1.gunlukMesai);//8 MUHASEBE
        System.out.println(mhsb1.saatucreti);//10 M
        mhsb1.maas();//M
        mhsb1.ozelsigorta();//M
        mhsb1.sigorta();//PERSONEL
        System.out.println(mhsb1.isim);//P
        System.out.println(mhsb1.soyisim);//P
        System.out.println(mhsb1.departman);//P

        /*EGER DATA turu olan class'da aradigimiz ozellik yoksa ,varsa onun parent'ina gidebilir ama child'a donus
        olmaz . Aradigi ozelligi bulamazsa CTE verir
         */



    }
}
