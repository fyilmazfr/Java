package day36_InheritancedaDateTypeKullanimi;

public class EYanHizmetliler extends BMuhasabe{
    protected int saatucreti=9;
    protected int gunlukmesaai=8;

    protected void maas(){
        System.out.println("YanHizmetliler :"+(30*saatucreti*gunlukmesaai)+"maas alir");
    }
    protected void issizliksigorta(){
        System.out.println("YanHizmetliler  %30 indirimli issizlik sigorta yapilabilir");
    }

    public static void main(String[] args) {
        /*Child class'daki bir method'un parent class'daki methodu etkisiz kilarak kendisini spesifiklestirmesidir.
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
         */
        BMuhasabe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);//muhasebe 8
        System.out.println(yh1.saatucreti);//m 10
        yh1.maas();//YH
        yh1.ozelsigorta();//M
        yh1.sigorta();//P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departman);//P
        //System.out.println(yh1.issizlikSigorta);CTE verircunku aramaya muhasebe den yoksa da personelden baslar

    }
}
