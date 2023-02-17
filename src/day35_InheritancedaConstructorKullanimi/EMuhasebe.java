package day35_InheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{
    /*
    Extends keyword kullanilan classlarda ister default constructor bulunsun istersek de biz yeni constructor(lar)
    olusturulaim Java constructor'in ilk satirina super(); constructor call yazar
    super(); cons call default cons 'a benzer , gorunmese de orada vardir ve calisir ancak biz ilk satira farkli bir
    cons call yazarsak Java super(); cons'ini siler.
     */
    EMuhasebe(){
        //memurdan buraya geldik ve bu satirda'da gorunmeyen super(){} cons call vardir
        //buda bizi bu class'in babasina goturur
        System.out.println("muhasebe parametresiz cons");
    }
    EMuhasebe(String isim){
        System.out.println("muhasebe parametreli cons");

    }


}
