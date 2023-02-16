package day35_InheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim="child isim belirtilmedi";
    protected String childKlupAdi="child Klubu";
    Child() {
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        //bu objeyi olusturmak icin Granpa cons. calisir
        //Parent veya child cons calismaz

        Child child1=new Child();
        child1.grandpaKlupAdi="child1";
        child1.parentKlupAdi="child2";

        //child1 objesi icin child constructor'u calisir
        /*Java'da bir class'i kullanabilmek icin o class'dan obje olusturur,dolayisiyla o class'in constructor'ini
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
}
