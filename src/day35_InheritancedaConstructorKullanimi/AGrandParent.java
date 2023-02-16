package day35_InheritancedaConstructorKullanimi;

public class AGrandParent {
    protected String isim="Granpa ismi belirtilmedi";
    /*
    her class'da gorunmese bile bir constractur vardir.Bu class'dan obje olusturmak istedigimizde default
    constructor devreye girecektir.
    Default constructor'u gozlemleyemeyecegimiz icin onun yerine kullanilabilecek parametresiz condtructur olusturualim
    parametresi constructor su sekilde olur;   Grandparent(){}
     */
    protected String grandpaKlupAdi="Grandpa Klubu";

    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }

}
