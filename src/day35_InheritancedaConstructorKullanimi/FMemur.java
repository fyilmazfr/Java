package day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {

    FMemur(){
        //burda benim gormedigim super(); cons call var,burdan beni parent class'daki parametresiz
        //cons 'a goturur yani emuhasebe pmetresiz cons
        System.out.println("memur parametresiz cons");
    }
    FMemur(String isim){
        System.out.println("memur parametreli cons");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();//icinde bulundugumuz class'dan bir obje olusturduk
    }
}/*Extends keyword kullanilan classlarda ister default constructor bulunsun istersek de biz yeni constructor(lar)
    olusturulaim Java constructor'in ilk satirina super(); constructor call yazar
    super(); cons call default cons 'a benzer , gorunmese de orada vardir ve calisir ancak biz ilk satira farkli bir
    cons call yazarsak Java super(); cons'ini siler.

    Eger biz mudahale edip kendi constructor call'umuzu olusturmassak Java'nin default olarak olusturdugu
     constructor call her zaman parametresizdir
     super();
     */
